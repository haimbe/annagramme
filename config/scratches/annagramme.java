import java.util.Map;

public class Annagramme {
    private String premierMot;
    private String secondMot;

    public Annagramme() {
        premierMot = "mot1";
        secondMot = "mot2";
    }

    public Annagramme(String premierMot) {
            this.premierMot = "bonjour";
            int i, nombre;
            char lettre;
            Map1<String, Integer> recurrence = new Hashmap<String, Integer>();

            for (lettre = (char) 65; lettre <= 90; lettre++) {
                nombre = 0;
                Map1 = lettre;

                for (i = 0; i < premierMot.length(); i++) {
                    if (lettre == premierMot.charAt(i)) {
                        nombre++;
                    }
                }
                if (nombre > 0) {
                    Map1.put(lettre, nombre);
                }

            }
        }

    public Annagramme(String secondMot){
          this.secondMot="bonjour";
          int i, nombre ;
          char lettre;
          Map2<String, Integer>recurrence = new Hashmap<String, Integer>();

          for (lettre=(char)65;lettre<=90; lettre++){
          nombre = 0;
          Map2=lettre;

          for(i=0;i<secondMot.length();i++){
              if(lettre==secondMot.charAt(i)){
                  nombre++;
              }
          }
          if (nombre >0){
              Map2.put(lettre,nombre);
                    }

           }


        }

     public static <K, V> boolean equalsMap(Map<K, V> Map1, Map<K, V> Map2) {
        int i=0;
          if (Map1.size()== Map2.size()){
                for(K key : map1.keySet()) {
                    if(map2.containsKey(key)) {
                        if(map1.get(key).equals(map2.get(key))) {
                            System.out.println("lettre "+key+" ok");
                            i++;}
                            else {
                                System.out.println("ce n'est pas un annagramme");}
                        }
                    else {
                            System.out.println("ce n'est pas un annagramme");}
                        }
                    }

          else {
              System.out.println("ce n'est pas un annagramme");}

          if (Map1.size()==i){
              System.out.println("Ces 2 mots sont des annagrammes");
          }
                }




}