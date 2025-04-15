package nezet;

public class Konzol {
    private JFrame frame;
    private


    public Konzol() {
        ini();
    }

    public static void main(String[] args) {
        new Konzol();
    }

    private void ini() {
        frame = new JFrame();
        frame.setContentPane(mainPanel);
        frame.setTitle("Form");
        frame.setSize(340, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JMenuItem ment = new JMenuItem("Mentés");//
        JMenuItem kilep = new JMenuItem("Kilépés");
        JMenu menu = new JMenu("program");
        menu.add(ment);
        menu.add(new JSeparator());
        menu.add(kilep);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        String msg = "Biztos kilépsz?";
        String cim = "KILÉPÉS!";
        int opt = menuBar.OK_CANCEL_OPTION;
        int gomb = menuBar.showConfirmDialog(null, msg , cim, opt);
        if (gomb == menuBar.OK_OPTION) {
            System.exit(0);
        }
        frame.setVisible(true);
        frame.pack();

    }




}
