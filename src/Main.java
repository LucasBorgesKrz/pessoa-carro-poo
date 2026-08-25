public class Main {
    public static void main(String[] args) {
       Pessoa p1 =  new Pessoa("Lucas",20,"Masculino");
       Pessoa p2 = new Pessoa("Borges",30,"masculino");
       Pessoa p3 = new Pessoa("Idna",31,"feminino");

       if (p1.idade > p2.idade && p1.idade > p3.idade) {
           System.out.println(p1.nome + " e a mais velha,com " + p1.idade + " anos. ");
       } else if (p2.idade > p1.idade && p2.idade > p3.idade) {
           System.out.println(p2.nome + " e a mais velha, com " + p2.idade + " anos.");
       } else {
           System.out.println(p3.nome + " e a mais velha,com " + p3.idade + " anos.");
       }

           Carro c1 = new Carro(2020,"Vermelho","Chrevolet");
           Carro c2 = new Carro(2026,"Preto","BYD");
           c1.cor = "Branco";
           // Alterar o atributo "Cor" de c1 nao afeta o c2 porque cada objeto tem criado com "new"
          // tem seu proprio espaco de memoria,com valores indepedentes
         // c1 e c2 vieram do mesmo lugar( classe carro), mas sao instancias diferentes -
        // mudar um nao reflete no outro,pois nao compartilham a mesma "gaveta" de atributos.
        System.out.println(c1.cor + " " + c1.ano + " " + c1.concessionaria);
        System.out.println(c2.cor + " " + c2.ano + " " + c2.concessionaria);






           }
      }