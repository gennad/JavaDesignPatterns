public abstract class TitleInfo {  
   private String titleName;
   
   //the "template method" - 
   //  calls the concrete class methods, is not overridden
   public final String ProcessTitleInfo() {
       StringBuffer titleInfo = new StringBuffer();

       titleInfo.append(this.getTitleBlurb());
       titleInfo.append(this.getDvdEncodingRegionInfo());
       
       return titleInfo.toString();
   }  
   
   //the following 2 methods are "concrete abstract class methods"
   public final void setTitleName(String titleNameIn) {
       this.titleName = titleNameIn;
   }
   public final String getTitleName() {
       return this.titleName;
   }
   
   //this is a "primitive operation", 
   //  and must be overridden in the concrete templates
   public abstract String getTitleBlurb();
   
   //this is a "hook operation", which may be overridden, 
   //hook operations usually do nothing if not overridden 
   public String getDvdEncodingRegionInfo() {
       return " ";
   }
}
