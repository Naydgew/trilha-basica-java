public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try{ 
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }catch (CepInvalidoExcepction e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoExcepction{
        if (cep.length() !=8)
        throw new CepInvalidoExcepction();
        
        return "23.765-064";
        
    }
}
