class HonoluluSoupBuffetBuilder extends SoupBuffetBuilder {
    public void buildClamChowder() {
        soupBuffet.clamChowder = new HonoluluClamChowder();
    }
    public void buildFishChowder() {
        soupBuffet.fishChowder = new HonoluluFishChowder();
    }
    
    public void setSoupBuffetName() {
        soupBuffet.soupBuffetName = "Honolulu Soup Buffet";
    }
}

class HonoluluClamChowder extends ClamChowder {
    public HonoluluClamChowder() {
        soupName = "PacificClamChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Pacific Clams");
        soupIngredients.add("1 cup pineapple chunks");
        soupIngredients.add("1/2 cup coconut milk");
        soupIngredients.add("1/4 cup SPAM");    
        soupIngredients.add("1/4 cup taro chips");
    }
}

class HonoluluFishChowder extends FishChowder {
    public HonoluluFishChowder() {
        soupName = "OpakapakaFishChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Opakapaka Fish");
        soupIngredients.add("1 cup pineapple chunks");
        soupIngredients.add("1/2 cup coconut milk");
        soupIngredients.add("1/4 cup SPAM");    
        soupIngredients.add("1/4 cup taro chips");
    }
}

