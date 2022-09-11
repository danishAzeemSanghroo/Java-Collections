
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
 * @author Dani
 */
public class DefaulterListPrint1 {
    
    public DefaulterListPrint1(){
        try{
            
                Book book= new Book();
            
                PageFormat pageFormat=getPageFormat();
				PageFormat pageFormat1=getPageFormat();
				PageFormat pageFormat2=getPageFormat();
                book.append(new Document(), pageFormat);
				book.append(new Document(), pageFormat);
				book.append(new Document(), pageFormat);
				
            
                PrinterJob printJob=PrinterJob.getPrinterJob();
                printJob.setPageable(book);
            
                if(printJob.printDialog()){
                    printJob.print();
                }
            }catch(NullPointerException | HeadlessException | PrinterException e){
            e.printStackTrace();
        }
    }

    private static PageFormat getPageFormat(){
    
        double PIXEL_PER_INCH=72;
            
            double PAPER_WIDTH=10.72*PIXEL_PER_INCH;
            double PAPER_HEIGHT=10.69*PIXEL_PER_INCH;
            
            double LEFT_MARGIN=0.1*PIXEL_PER_INCH;
            double RIGHT_MARGIN=0.1*PIXEL_PER_INCH;
            
            double TOP_MARGIN=0.01*PIXEL_PER_INCH;
            double BOTTOM_MARGIN=0.01*PIXEL_PER_INCH;
            
            Paper paper= new Paper();
            paper.setSize(PAPER_WIDTH, PAPER_HEIGHT);
            
            paper.setImageableArea(LEFT_MARGIN, TOP_MARGIN, paper.getWidth()- (LEFT_MARGIN + RIGHT_MARGIN),(paper.getHeight())-(TOP_MARGIN +BOTTOM_MARGIN));
               
            PageFormat pageFormat=new PageFormat();
            pageFormat.setPaper(paper);
            pageFormat.setOrientation(PageFormat.PORTRAIT);
               
            return pageFormat; 
    }
    
    class Document extends Component implements Printable{
    
        
        
        public Document (){
           
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
                
                Font f2=new Font("Arial",Font.BOLD,10);
                graphics.setFont(f2);
                int x=50;
                int z=10;
                graphics.drawString("ROLL NO.", 6, 46+z);
                graphics.drawString("NAME", 10+x, 46+z);
                graphics.drawString("F.NAME", 50+x, 46+z);
                graphics.drawString("SURNAME", 100+x, 46+z);
                graphics.drawString("BOOK TITLE", 150+x, 46+z);
                graphics.drawString("AUTHOR", 250+x, 46+z);
                graphics.drawString("PUBLISHER", 380+x, 46+z);
                graphics.drawString("PRICE", 530+x, 46+z);
                
                graphics.drawLine(20, 66, 616, 66);
				
				
				int y=77;
				
				for(int i=0; i<70; i++){
                                    
                                 

				graphics.drawString("18CS"+i, 6, y+z);
				graphics.drawString("xyz"+i, 10+x, y+z);
				graphics.drawString("abc"+i, 50+x, y+z);
				graphics.drawString("www"+i, 100+x, y+z);
				graphics.drawString("hhh"+i, 150+x, y+z);
                graphics.drawString("jsjx"+i, 250+x, y+z);
                graphics.drawString("jsss"+i, 380+x, y+z);
                graphics.drawString("jaka"+i, 500+x, y+z);
				y+=20;
				
				}
                
            
            }catch(Exception e){
              e.printStackTrace();
            }
            return PAGE_EXISTS;
        }// print Method       
    }// Documents Class
	
	public static void main (String arg[]){
		new DefaulterListPrint1();
	}
	
}// Main Class    
    
