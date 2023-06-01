package CustomArraylist;
// this has a problem , as it can add only integers
public class Main {
    public static void main(String[] args) {
        Customlist customlist = new Customlist();
        for(int i=0;i < 12;i++) {
            customlist.add(i*2);
        }
        System.out.println(customlist);
        customlist.remove();
        customlist.add(1222);
        System.out.println(customlist);
    }
}
