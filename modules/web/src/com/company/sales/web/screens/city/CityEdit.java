package com.company.sales.web.screens.city;

import com.haulmont.cuba.gui.screen.*;
import com.company.sales.entity.City;

@UiController("sales_City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
@LoadDataBeforeShow
public class CityEdit extends StandardEditor<City> {
}