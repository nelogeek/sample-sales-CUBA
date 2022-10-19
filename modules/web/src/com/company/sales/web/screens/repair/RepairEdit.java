package com.company.sales.web.screens.repair;

import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Repair;

@UiController("sales_Repair.edit")
@UiDescriptor("repair-edit.xml")
@EditedEntityContainer("repairDc")
@LoadDataBeforeShow
public class RepairEdit extends StandardEditor<Repair> {
}