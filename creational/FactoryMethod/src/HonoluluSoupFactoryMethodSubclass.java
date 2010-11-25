class HonoluluSoupFactoryMethodSubclass extends SoupFactoryMethod {
    public String makeBuffetName() {
        return "Honolulu Soup Buffet";
    }
    public ClamChowder makeClamChowder() {
        return new HonoluluClamChowder();
    }
    public FishChowder makeFishChowder() {
        return new HonoluluFishChowder();
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