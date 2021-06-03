package com.example.application.components.leafletmap;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.notification.Notification;

@JsModule("./components/leafletmap/leaflet-map.ts")
@Tag("leaflet-map")
@CssImport("leaflet/dist/leaflet.css")
@NpmPackage(value = "leaflet", version = "^1.7.1")
@NpmPackage(value = "@types/leaflet", version = "^1.5.23")
public class LeafletMap extends Component implements HasSize {

    public void setView(double latitude, double longitude, int zoomLevel) {
        getElement().callJsFunction("setView", latitude, longitude, zoomLevel);
    }

    @ClientCallable
    public void somethingHappened() {
        Notification.show("Something happened in the browser");
    }
}
