package ClassActivities.Searching.HashMap;

import ClassActivities.Searching.HashMap.MyHashMap;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person("fskn@hotmail.com", "Frederikke Nilsson");
        Person p2 = new Person ("test@hotmail.com", "Jesper Pedersen");
        Person p3 = new Person ("email@hotmail.com", "Claudia Hansen");

        MyHashMap<String, Person> map = new MyHashMap<>(5);
        map.put(p1.getEmail(), p1);
        map.put(p2.getEmail(), p2);
        map.put(p3.getEmail(), p3);

        Person test = map.get("fskn@hotmail.com");
        System.out.println(test);
    }

    private static class Person {
        private final String email;
        private final String name;

        public Person(String email, String name) {
            this.email = email;
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "email='" + email + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
