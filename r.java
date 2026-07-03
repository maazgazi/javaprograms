class r
{
    public static void main(String[] args) {
        
        System.out.println("cat".matches("c.t"));
        System.out.println("maaz".matches("m..z"));
        System.out.println("maaz".matches("m..z"));

        System.out.println("aabb".matches("ab*"));

        System.out.println("aabb".matches("ab*"));

        System.out.println("9890234556".matches("98........"));

        System.out.println("9889456778".matches("98........"));
    }
}