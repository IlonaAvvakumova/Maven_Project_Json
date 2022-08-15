package com.json.gson_test1.view;

import com.json.gson_test1.controller.LabelController;
import com.json.gson_test1.model.Label;
import com.json.gson_test1.repository.LabelRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LabelRepository lab = new LabelRepository();
        LabelController label = new LabelController();
        Label la = null;
       // List<Label> listlabel = new ArrayList<>();
        List<Label> listlabel = lab.getAll();
        System.out.println("Ввести книгу? да или нет?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        while (answer.equals("да")) {
            la = new Label();
            label.labelControll(la); // задать параметры для класса Label
            lab.save(la); //создать файл json от класса Label
            listlabel.add(la);
            System.out.println("Ввести еще книгу? да или нет?");
            answer = scan.nextLine();

        }


       System.out.println("Какой id нужно получить?");
        Integer answer2 = scan.nextInt();
        List<Label> list2 = listlabel.stream().filter(a -> a.getId() == answer2).collect(Collectors.toList());

        System.out.println("Книга под id: " + answer2 + " - " + list2);

    /*    System.out.println("Какой id нужно удалить?");
        Integer answer3 = scan.nextInt();

        List<Label> list3 = listlabel.stream().dropWhile(a->a.getId()==answer3).collect(Collectors.toList());

*/
       lab.deleteById(listlabel);
    }

}
