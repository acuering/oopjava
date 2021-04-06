public class Main {

        public static void main(String[] args) {
            // write your code here
            Girl model = new Girl();

            model.name = "ivana";
            model.address = "paradise street";
            model.age = 26;

            System.out.println(model.name);
            System.out.println(model.address);
            System.out.println(model.age);

            Boy singer = new Boy();

            singer.name = "jack";
            singer.address = "boyband street";
            singer.age = 46;

            System.out.println(singer.name);
            System.out.println(singer.address);
            System.out.println(singer.age);


            Relationship family = new Relationship();

            family.name = "cuering";
            family.address = "cebu city";
            family.siblings = 6;

            System.out.println(family.name);
            System.out.println(family.address);
            System.out.println(family.siblings);
        }
    }


