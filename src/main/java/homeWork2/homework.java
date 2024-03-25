package homeWork2;

public class homework {
    public static class Strings {

    }

    public static void main(String[] args) {
        /*@Test
        public void whenAssertingEquality () {
            String first = "Hello world";
            String second = "Hello world";
            Assertions.assertTrue(first == second, "Выражения равны");*/



            String s = "1С2е3г4о3д22н111я о111т3ли7чн88ый 3де344н5ь 4ч3т555обы7 345вы2у3ч2ить 1Д1ж22а9в88у4\n";
            String f = s.replaceAll("[0-9]", "");
            System.out.println(f);
            String[] x = f.split(" ", 6);
        for (String string : x) {
            if (string.startsWith("Д") || string.startsWith("д")) {
                System.out.println(string);
            }
        }

        }
    }

