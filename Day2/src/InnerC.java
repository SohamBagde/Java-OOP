public class InnerC {
   static class Test { // if u remove static it wont work
        String name;
        public Test(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("harsh");
        Test b = new Test("dogesh");
    }
}


