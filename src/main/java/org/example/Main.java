package org.example;

import com.github.javaparser.*;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.printer.DotPrinter;
import com.github.javaparser.printer.XmlPrinter;
import com.github.javaparser.printer.YamlPrinter;
//import com.github.javaparser.JavaParser;
//import com.github.javaparser.StaticJavaParser;
//import com.github.javaparser.ast.CompilationUnit;
//import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
//import java.io.File;
//import java.io.IOException;

import javax.xml.stream.events.Comment;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

//        String code = "";
//        try {
//            code = new String(Files.readAllBytes(Paths.get("C:\\Users\\jidam\\Desktop\\javaparser test\\untitled\\src\\main\\java\\org\\example\\MyClass.java")));
//        } catch(Exception e){
//            System.out.println(e);
//        }
//
//        JavaParser p = new JavaParser();
//        ParseResult<CompilationUnit> cu = p.parse(code);
//        Optional<CompilationUnit> result  = cu.getResult();
//        System.out.println(result);

        //JavaParser 클래스가 자바 소스코드를 파싱해서 AST를 얻는 클래스임


        CompilationUnit c;


        try{
            c = StaticJavaParser.parse(new File("C:\\Users\\jidam\\Desktop\\javaparser test\\untitled\\src\\main\\java\\org\\example\\MyClass.java"));
            //System.out.println(c);

            YamlPrinter printer = new YamlPrinter(true);
            System.out.println(printer.output(c));

            XmlPrinter xmlPrinter = new XmlPrinter(true);
            //System.out.println(printer.output(c));

            DotPrinter dotPrinter = new DotPrinter(true);
            FileWriter fileWriter = new FileWriter("ast3.dot");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(xmlPrinter.output(c));


        }catch(Exception e){

        }










    }
}