public class DataPrinter {
    String data;
    int length;

    DataPrinter(String data){
        this.data = data;
        saveLength();
    }

    String getData(){
        return data;
    }

    void saveLength(){
        length = getData().length();
    }

    void print(){
        if(length>2){
            System.out.println(getData());
        } else {
            System.out.printf("[data] must be longer than 2, but got %s.", getData());
        }
    }

    public static class SubDataPrinter extends DataPrinter{
        private String subData;

        public SubDataPrinter(String data) {
            super(data);
            this.subData = data.substring(0, data.length() - 1);
        }

        @Override
        String getData() {
            return super.getData();
        }
    }

    public static void main(String[] args) {
        DataPrinter dataPrinter = new SubDataPrinter("USA");
        dataPrinter.print();
    }
}
