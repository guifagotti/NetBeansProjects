/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaarquivoaleatorio;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author guifagotti
 */
public class RandomAccessAccountRecord extends AccountRecord {
    //um int 4 bytes - numero conta
    //duas strings (max 15 caracters) = 60 bytes
    //balanco - tamanho 8 bytes
    //Total = 72 bytes
    public static final int SIZE = 72;
    
    
    public RandomAccessAccountRecord()
    {
        super(0,"","",0);
        
    }
    
    
    public RandomAccessAccountRecord ( int account, String First , String Last , double Balanco)
    {
        super(account,First,Last,Balanco);
    }
    public void read(RandomAccessFile file) throws IOException
    {
        setAccount(file.readInt());
        setFirstName(readName(file));
        setLastName(readName(file));
        setBalance(file.readDouble());
        
    }
    
    private String readName(RandomAccessFile file) throws IOException
    {
        char name[] = new char [15], temp;
        for(int count =0; count <name.length;count ++)
        {
        temp = file.readChar();
        name[count]= temp;
        }
        
        return new String(name).replace("\0","");
        
    }
    
    public void write(RandomAccessFile file) throws IOException
    {
        file.write(getAccount());
        writeName(file,getFirstName());
        writeName(file,getLastName());
        file.writeDouble(getBalance());
        
    }
    
    private void writeName (RandomAccessFile file, String firstName) throws IOException
    {
        // lista de string
        StringBuffer buffer = null;
        //se conteudo firstName nao for vazio
        if (firstName!= null)
            //O conteudo do buffer e igual ao conteudo do firstname
            buffer = new StringBuffer(firstName);
        else
            //e criado um buffer de string vazio com 15 caracteres
            buffer = new StringBuffer(15);
        buffer.setLength(15);
        //convertendo um buffer de string para caracteres
        file.writeChars(buffer.toString());
                
    }
}
