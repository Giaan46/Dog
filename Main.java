package tokio.school;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        System.out.println("Dogs y funciones");
        Dog boi    = new Dog("boi"   ,  30,  6);
        Dog tyri   = new Dog("tyri"  ,  40, 12);
        Dog charis = new Dog("charis", 120,  7);
        System.out.println(boi);


//         Crea una función getName, usando una expresión lambda, en la que dado un perro nos devuelva su nombre

        Nombre getName = (name) -> name;
                System.out.println(getName.say(boi.getName()));
                System.out.println(getName.say(tyri.getName()));
                System.out.println(getName.say(charis.getName()));

//           Crea otra función getInitial, usando una expresión lambda, en la que dado un String nos devuelva la primera letra de dicho String.
        Nombre getInitial = (name) ->  String.valueOf(( name.charAt(0)));
        System.out.println(getInitial.say(boi.getName()));
        System.out.println(getInitial.say(tyri.getName()));
        System.out.println(getInitial.say(charis.getName()));
        System.out.println("______________________________");

//        Usa el método por defecto andThen del interfaz Function para componer ambas funciones y lograr una nueva función que, dado un
//perro, nos devuelva el carácter de su letra inicial.


        Function<String, String> st = name -> name;
        Function<String, String> ch = name -> String.valueOf(name.charAt(0));
        st = st.andThen(ch);

        System.out.println("andThen: ");
        System.out.println(st.apply(boi.getName()));
        System.out.println(st.apply(tyri.getName()));
        System.out.println(st.apply(charis.getName()));
        //  Intenta obtener el mismo resultado con la función compose en vez de con andThen.
        System.out.println("Compose: ");
        System.out.println(st.compose(ch).apply(boi.getName()));
        System.out.println(st.compose(ch).apply(tyri.getName()));
        System.out.println(st.compose(ch).apply(charis.getName()));
        System.out.println("_______________________________");






      // ...

    }

}


