package com.mycom.word;
import java.io.IOException;
import java.util.* ;
public class WordManager {
    Scanner s = new Scanner(System.in) ;
    WordCRUD wordCRUD ;

    WordManager(){
        wordCRUD =  new WordCRUD(s) ;
    }
    public int selectMenu(){
        System.out.print("""
                *** 영단어 마스터 ***
                ***********************
                1. 모든 단어 보기"
                2. 수준별 단어 보기"
                3. 단어 검색"
                4. 단어 추가"
                5. 단어 수정"
                6. 단어 삭제"
                7. 파일 저장"
                0. 나가기"
                ***********************"
                => 원하는 메뉴는?""" + " ") ;
        return s.nextInt() ;

    }
    public void start() throws IOException {
        wordCRUD.loadFile() ;
        while(true){
            int menu = selectMenu() ;
            if(menu == 0) break ;
            if(menu == 1){
                wordCRUD.listAll() ;
            }
            else if(menu == 2){
                wordCRUD.searchLevel() ;
            }
            else if(menu == 3){
                wordCRUD.searchWord() ;
            }
            else if(menu == 4){
                wordCRUD.addItem() ;
            }
            else if(menu == 5){
                wordCRUD.updateItem() ;
            }
            else if(menu == 6){
                wordCRUD.deleteItem() ;
            }
            else if(menu == 7){
                wordCRUD.saveFile() ;
            }
        }
    }


}
