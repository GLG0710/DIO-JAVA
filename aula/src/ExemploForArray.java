public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE","MARCIO","GUSTAVO","JOÃO"};

        for (int x=0; x<alunos.length; x++){
            if (x==2) 
            continue;
            System.out.println("O aluno no índice x="+x+" é "+alunos[x]);
            if (x==3)
            break;
        }
       
        int h=1;
        while (h<=10) {
            System.out.println(h++);
        }    
        h--; /*No comando anterior, ele primeiro printa, dps incrementa. Então sem essa linha, vai aparecer um 11 */   
        do {
            System.out.println(h--);
        }
        while (h>=0);
    }
}
