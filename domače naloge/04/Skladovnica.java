//63170196

class Skladovnica {
    
    private int kapacitetaPrvega;
    private int prirast;
    private int steviloSkatel = 0;

    public Skladovnica (int kapacitetaPrvega, int prirast) {
        this.kapacitetaPrvega = kapacitetaPrvega;
        this.prirast = prirast;
    }

    public int kapacitetaKupa (int kup) {
        if (kup < 0)
            return kapacitetaPrvega;
        return (kup-1) * prirast + kapacitetaPrvega;
    }

    public void dodaj (int stSkatel) {
        steviloSkatel += stSkatel;
    }

    public int skupnoSteviloSkatel () {
        return steviloSkatel;
    }

    public int zasedenostKupa (int kup) {
        int y = 0; 
        for (int i = 1; i != kup; i++) {
            y += kapacitetaKupa(i);
        }
        if (steviloSkatel > y+kapacitetaKupa(kup))
            return kapacitetaKupa(kup);
        else if (steviloSkatel-y <= 0)
           return 0;
        else
            return steviloSkatel- (y);
    }

    public boolean odvzemi (int stSkatel) {
        if (stSkatel > steviloSkatel)
            return false;
        else {
            steviloSkatel -= stSkatel;
            return true;
        }
    }

    public int poisciKup (int skatla) {
        int y = 0;
        int i = 1;
        if (skatla > steviloSkatel)
            return -1;
        while (1 == 1) {
            y += kapacitetaKupa (i);
            if (skatla <= y)
                return i;
            i++;
        }
    }

    public Skladovnica prestavi (int kP, int pr) {
        Skladovnica sk = new Skladovnica (kP, pr);
        sk.dodaj(steviloSkatel);
        //this.kapacitetaPrvega = 0;
        this.steviloSkatel = 0;
        return sk;
    }
}