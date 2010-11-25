class TestFacade {
   public static void main(String[] args) {
       FacadeCuppaMaker cuppaMaker = new FacadeCuppaMaker();
       FacadeTeaCup teaCup = cuppaMaker.makeACuppa();
       System.out.println(teaCup);
   }
}