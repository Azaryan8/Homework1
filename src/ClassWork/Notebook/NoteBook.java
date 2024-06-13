package ClassWork.Notebook;

public class NoteBook {
    private String model;
    private String producer;

    private String monitor;

    public NoteBook(String model,String producer,String monitor) {
        this.model = model;
        this.producer = producer;
        this.monitor = monitor;
    }

    public void addBright(){
        System.out.println("Добавить яркость");
    }

    public void deleteBright(){
        System.out.println("Убовить  яркость");
    }

    public class monitor{
        private int diagonal;

        public monitor(int diagonal) {
            this.diagonal = diagonal;
        }

        public void addBright(){
            System.out.println("Добавить яркость");
        }

        public void deleteBright(){
            System.out.println("Убовить  яркость");
        }
    }




}
