class SoupFactoryMethod {
    public SoupFactoryMethod() {}
        
    public SoupBuffet makeSoupBuffet() {
        return new SoupBuffet();
    }

    public ChickenSoup makeChickenSoup() {
        return new ChickenSoup();
    }
    public ClamChowder makeClamChowder() {
        return new ClamChowder();
    }
    public FishChowder makeFishChowder() {
        return new FishChowder();
    }
    public Minnestrone makeMinnestrone() {
        return new Minnestrone();
    }
    public PastaFazul makePastaFazul() {
        return new PastaFazul();
    }
    public TofuSoup makeTofuSoup() {
        return new TofuSoup();
    }
    public VegetableSoup makeVegetableSoup() {
        return new VegetableSoup();
    }

    public String makeBuffetName() {
        return "Soup Buffet";
    }
}