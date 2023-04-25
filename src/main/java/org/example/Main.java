package org.example;

import com.github.javaparser.*;
import com.github.javaparser.ast.CompilationUnit;
//import com.github.javaparser.JavaParser;
//import com.github.javaparser.StaticJavaParser;
//import com.github.javaparser.ast.CompilationUnit;
//import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
//import java.io.File;
//import java.io.IOException;

import javax.xml.stream.events.Comment;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String code = "";
        try {
            code = new String(Files.readAllBytes(Paths.get("C:\\Users\\jidam\\Desktop\\javaparser test\\untitled\\src\\main\\java\\org\\example\\MyClass.java")));
        } catch(Exception e){
            System.out.println(e);
        }

        JavaParser p = new JavaParser();
        ParseResult<CompilationUnit> cu = p.parse(code);
        Optional<CompilationUnit> result  = cu.getResult();
        System.out.println(result);

        //JavaParser 클래스가 자바 소스코드를 파싱해서 AST를 얻는 클래스임










    }
}