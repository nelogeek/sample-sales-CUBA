package com.company.sales.web.screens.autoservice;

import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.Autoservice;

@UiController("sales_Autoservice.browse")
@UiDescriptor("autoservice-browse.xml")
@LookupComponent("autoservicesTable")
@LoadDataBeforeShow
public class AutoserviceBrowse extends StandardLookup<Autoservice> {
}