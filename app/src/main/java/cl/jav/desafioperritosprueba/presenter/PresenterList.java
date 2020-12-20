package cl.jav.desafioperritosprueba.presenter;

import java.util.List;

import cl.jav.desafioperritosprueba.model.InterfazModel;
import cl.jav.desafioperritosprueba.presenterview.IPresenterViewList;


public class PresenterList implements IPresenterList,IPresenterModel{
    InterfazModel interfazModel;
    IPresenterViewList iPresenterViewList;

    public PresenterList(IPresenterViewList iPresenterViewList) {
        this.iPresenterViewList = iPresenterViewList;
    }

    public void setInterfazModel(InterfazModel interfazModel) {
        this.interfazModel = interfazModel;
    }

    @Override
    public void loadBreeds() {
        interfazModel.loadBreeds();
    }


    @Override
    public void notificar(List<String> list) {
        iPresenterViewList.notificar(list);
    }
}
