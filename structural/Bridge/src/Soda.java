public abstract class Soda {  
   SodaImp sodaImp; 
   
   public void setSodaImp() {
       this.sodaImp = SodaImpSingleton.getTheSodaImp();
   }
   public SodaImp getSodaImp() {
       return this.sodaImp;
   }
   
   public abstract void pourSoda();
}
