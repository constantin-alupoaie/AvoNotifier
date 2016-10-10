package com.example.constantin.avonotifier.impl.just;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 5.0.0.2
//
// Created by Quasar Development at 09/10/2016
//
//---------------------------------------------------


import java.util.Hashtable;
import org.ksoap2.serialization.*;

public class AAKDosarSedinta extends AttributeContainer implements KvmSerializable
{

    
    public String complet;
    
    public java.util.Date data;
    
    public String ora;
    
    public String solutie;
    
    public String solutieSumar;
    
    public java.util.Date dataPronuntare;
    
    public AAKEnums.DocumentSedinta documentSedinta;
    
    public String numarDocument;
    
    public java.util.Date dataDocument;

    public AAKDosarSedinta ()
    {
    }

    public AAKDosarSedinta (java.lang.Object paramObj,AAKExtendedSoapSerializationEnvelope __envelope)
    {
	    
	    if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;


        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                //if you have compilation error here, please use a ksoap2.jar and ExKsoap2.jar from libs folder (in the generated zip file)
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                java.lang.Object obj = info.getValue(); 
                if (info.name.equals("complet"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.complet = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.complet = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("data"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.data = AAKHelper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.data = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("ora"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.ora = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.ora = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("solutie"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.solutie = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.solutie = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("solutieSumar"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.solutieSumar = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.solutieSumar = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dataPronuntare"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dataPronuntare = AAKHelper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dataPronuntare = (java.util.Date)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("documentSedinta"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.documentSedinta = AAKEnums.DocumentSedinta.fromString(j.toString());
                            }
                        }
                        else if (obj instanceof AAKEnums.DocumentSedinta){
                            this.documentSedinta = (AAKEnums.DocumentSedinta)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("numarDocument"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.numarDocument = j.toString();
                            }
                        }
                        else if (obj instanceof String){
                            this.numarDocument = (String)obj;
                        }
                    }
                    continue;
                }
                if (info.name.equals("dataDocument"))
                {
                    if(obj!=null)
                    {
        
                        if (obj.getClass().equals(SoapPrimitive.class))
                        {
                            SoapPrimitive j =(SoapPrimitive) obj;
                            if(j.toString()!=null)
                            {
                                this.dataDocument = AAKHelper.ConvertFromWebService(j.toString());
                            }
                        }
                        else if (obj instanceof java.util.Date){
                            this.dataDocument = (java.util.Date)obj;
                        }
                    }
                    continue;
                }

            }

        }



    }

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.complet!=null?this.complet:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.data!=null?AAKHelper.getDateTimeFormat().format(this.data):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.ora!=null?this.ora:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.solutie!=null?this.solutie:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.solutieSumar!=null?this.solutieSumar:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.dataPronuntare!=null?AAKHelper.getDateTimeFormat().format(this.dataPronuntare):SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==6)
        {
            return this.documentSedinta!=null?this.documentSedinta.toString():SoapPrimitive.NullNilElement;
        }
        if(propertyIndex==7)
        {
            return this.numarDocument!=null?this.numarDocument:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.dataDocument!=null?AAKHelper.getDateTimeFormat().format(this.dataDocument):SoapPrimitive.NullNilElement;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 9;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "complet";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "data";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "ora";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "solutie";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "solutieSumar";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dataPronuntare";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "documentSedinta";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "numarDocument";
            info.namespace= "portalquery.just.ro";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "dataDocument";
            info.namespace= "portalquery.just.ro";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}
