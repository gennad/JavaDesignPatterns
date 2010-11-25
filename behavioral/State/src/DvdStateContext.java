public class DvdStateContext {  
   private DvdStateName dvdStateName; 
    
   public DvdStateContext() {
       setDvdStateName(new DvdStateNameStars());  
       //start with stars
   }
   
   public void setDvdStateName(DvdStateName dvdStateNameIn) {
       this.dvdStateName = dvdStateNameIn;
   }
   
   public void showName(String nameIn) {
       this.dvdStateName.showName(this, nameIn);
   }
}
