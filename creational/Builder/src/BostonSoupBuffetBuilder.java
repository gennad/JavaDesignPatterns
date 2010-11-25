class BostonSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
       soupBuffet.clamChowder = new BostonClamChowder();
    }
    public void buildFishChowder() {
       soupBuffet.fishChowder = new BostonFishChowder();
    }    
    
    public void setSoupBuffetName() {
       soupBuffet.soupBuffetName = "Boston Soup Buffet";
    }
}

class BostonClamChowder extends ClamChowder {
    public BostonClamChowder() {
        soupName = "QuahogChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Quahogs");
        soupIngredients.add("1 cup corn");    
        soupIngredients.add("1/2 cup heavy cream");
        soupIngredients.add("1/4 cup butter");    
        soupIngredients.add("1/4 cup potato chips");
    }
}

class BostonFishChowder extends FishChowder {
    public BostonFishChowder() {
        soupName = "ScrodFishChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Scrod");
        soupIngredients.add("1 cup corn");    
        soupIngredients.add("1/2 cup heavy cream");
        soupIngredients.add("1/4 cup butter");    
        soupIngredients.add("1/4 cup potato chips");
    }
}