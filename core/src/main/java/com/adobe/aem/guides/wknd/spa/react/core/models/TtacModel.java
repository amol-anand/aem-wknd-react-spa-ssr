package com.adobe.aem.guides.wknd.spa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = {SlingHttpServletRequest.class, Resource.class},
        adapters = {ComponentExporter.class},
        resourceType = TtacModel.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class TtacModel implements ComponentExporter{
    static final String RESOURCE_TYPE = "wknd-spa-react/components/ttac";

    @JsonProperty
    @ValueMapValue
    private String image;

    @JsonProperty
    @ValueMapValue
    private String title;

    @JsonProperty
    @ValueMapValue
    private String text;

    @JsonProperty
    @ValueMapValue
    private String ctaText;

    @JsonProperty
    @ValueMapValue
    private String ctaHref;

    // Indicates whether the component is empty - if it isn't, just return null so the serializer ignores the field
    @JsonProperty
    public Boolean isEmpty() {
        Boolean empty = image == null && title == null && text == null && ctaHref == null && ctaText == null;
        return empty ? empty : null;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getCtaText() {
        return ctaText;
    }

    public String getCtaHref() {
        return ctaHref;
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }
}
