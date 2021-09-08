package controller;


import domain.NameCard;
import model.Model;
import view.EndView;
import view.InputView;

public class Controller {

	public static void reqChoice(int reqNo) {
		switch(reqNo) {
		case 1:
			NameCard namecard = InputView.getNameCardInfo();
			Model.getNamecardList().add(namecard);
			EndView.addView(namecard);
			break;
		case 2:
			String name = InputView.getSearchName();
			NameCard searchedNamecard = Model.getNameCard(name);
			if(searchedNamecard != null)
				EndView.showNameCard(searchedNamecard);
			else
				EndView.errorMsg("찾는 명함이 없습니다");
			break;
		case 3:
			EndView.printAll(Model.getNamecardList());
			break;
		case 4:
			String deleteName = InputView.getDeleteName();
			boolean isDeleted= Model.deleteNameCard(deleteName);
			if(isDeleted)
				EndView.deletedView(deleteName);
			else
				EndView.errorMsg("찾는 명함이 없습니다");
			break;
		case 5:
			Model.saveFile();
			EndView.printMsg("파일이 저장되었습니다");
			break;
		case 6:
			Model.saveFile();
			System.exit(0);
			break;
		default:
			EndView.errorMsg("잘못된 입력입니다.");	
			break;
		}
	}
}
