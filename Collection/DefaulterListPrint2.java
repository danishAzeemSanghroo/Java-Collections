
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author 
 */
public class DefaulterListPrint2 {
    
    public DefaulterListPrint2(){
        try{
            
                Book book= new Book();
            
                PageFormat pageFormat1=getPageFormat();
                PageFormat pageFormat2=getPageFormat();
                PageFormat pageFormat3=getPageFormat();
                PageFormat pageFormat4=getPageFormat();

StudentBean stdBean1=new StudentBean();
StudentBean stdBean2=new StudentBean();
StudentBean stdBean3=new StudentBean();
StudentBean stdBean4=new StudentBean();
stdBean1.setName();


				Document doc1=new Document(stdBean1);
				Document doc2=new Document(stdBean2);
				Document doc3=new Document(stdBean3);
				Document doc4=new Document(stdBean4);

                book.append(doc1, pageFormat1);
                book.append(doc2, pageFormat2);
                book.append(doc3, pageFormat3);
                book.append(doc4, pageFormat4);
            
                PrinterJob printJob=PrinterJob.getPrinterJob();
                printJob.setPageable(book);
            
			    boolean ok=printJob.printDialog();
                if(ok)
                    printJob.print();
                
            }catch(NullPointerException | HeadlessException | PrinterException e){
            e.printStackTrace();
        }
    }

    private static PageFormat getPageFormat(){
    
        double PIXEL_PER_INCH=72;
            
            double PAPER_WIDTH=10.72*PIXEL_PER_INCH;
            double PAPER_HEIGHT=11.69*PIXEL_PER_INCH;
            
            double LEFT_MARGIN=0.1*PIXEL_PER_INCH;
            double RIGHT_MARGIN=0.1*PIXEL_PER_INCH;
            
            double TOP_MARGIN=0.1*PIXEL_PER_INCH;
            double BOTTOM_MARGIN=0.1*PIXEL_PER_INCH;
            
            Paper paper= new Paper();
            paper.setSize(PAPER_WIDTH, PAPER_HEIGHT);
            
            paper.setImageableArea(LEFT_MARGIN, TOP_MARGIN, paper.getWidth()- (LEFT_MARGIN + RIGHT_MARGIN),(paper.getHeight())-(TOP_MARGIN +BOTTOM_MARGIN));
               
            PageFormat pageFormat=new PageFormat();
            
			pageFormat.setPaper(paper);
            
			pageFormat.setOrientation(PageFormat.PORTRAIT);
               
            return pageFormat; 
    }
    
    class Document extends Component implements Printable{
    
        StudentBean stdBean;
        
        public Document (StudentBean stdBean){
           this.stdBean=stdBean;
        }
        
        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            try{
                
                Graphics2D g2d= (Graphics2D)graphics;
                g2d.translate(pageFormat.getImageableX(),pageFormat.getImageableY());
                g2d.setPaint(Color.BLACK);
                g2d.setColor(Color.BLACK);
                
                Font f=new Font("Arial",Font.BOLD,14);
                graphics.setFont(f);
                
                graphics.drawString("DEFAULTER LIST", 216, 20);
                g2d.drawLine(20, 36, 616, 36);
                
                Font f2=new Font("Arial",Font.BOLD,12);
                graphics.setFont(f2);
                
                graphics.drawString("S.NO", 20, 46+10);
                graphics.drawString("ROLL NO", 36+90, 46+10);
                graphics.drawString("NAME", 156+90, 46+10);
                graphics.drawString("BOOK TITAL", 276+90, 46+10);
                graphics.drawString("DATE OF ISSUE", 396+90, 46+10);
                
                graphics.drawLine(20, 66, 616, 66);
                
				
                graphics.drawString("1", 20, 46+10+15);
                graphics.drawString(stdBean.getRollNo(), 36+90, 46+10+15);
                graphics.drawString(stdBean.getName(), 156+90, 46+10+15);
                graphics.drawString(stdBean.getFName(), 276+90, 46+10+15);
                graphics.drawString("26-jan-2021", 396+90, 46+10+15);
                
            
            }catch(Exception e){
              e.printStackTrace();
            }
            return PAGE_EXISTS;
        }// print Method       
    }// Documents Class
	
	public static void main (String arg[]){
		new DefaulterListPrint2();
	}
	
}// Main Class    
    
