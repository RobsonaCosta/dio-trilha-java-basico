public class exemploForBreackeContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                break;
            
            System.out.println(numero);
            
        }
    }
    public class exemploForBreackeContinue2 {
        public static void main(String[] args) {
            for(int numero = 1; numero <=5; numero ++){
                if(numero == 3)
                    continue;
                
                System.out.println(numero);
                
            }
        }
    }
    
}
