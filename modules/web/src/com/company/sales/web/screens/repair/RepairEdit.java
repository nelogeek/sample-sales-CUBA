package com.company.sales.web.screens.repair;

import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Repair;

import javax.inject.Inject;

@UiController("sales_Repair.edit")
@UiDescriptor("repair-edit.xml")
@EditedEntityContainer("repairDc")
@LoadDataBeforeShow
public class RepairEdit extends StandardEditor<Repair> {

    @Inject
    private InstanceContainer<Repair> repairDc;

    @Override
    protected void onChangeEvent(DataContext.ChangeEvent event) {
        repairDc.addItemPropertyChangeListener(e -> {
            if (e.getProperty().equals("autoservice")) {

                repairDc.getItem().setEmployee(null);
            }
        });
    }
}