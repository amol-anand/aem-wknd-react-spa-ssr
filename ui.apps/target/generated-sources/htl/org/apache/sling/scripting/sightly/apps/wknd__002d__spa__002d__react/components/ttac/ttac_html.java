/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd__002d__spa__002d__react.components.ttac;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class ttac_html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
out.write("<!-- /* An HTL Component for representing a relatively basic element of a page, a title/text/CTA element */ -->\n");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.spa.react.core.models.TtacModel.class.getName(), obj());
out.write("\n\n");
{
    Object var_testvariable0 = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
    if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
        out.write("<div>\n  [Click to configure TTAC component...]\n</div>");
    }
}
out.write("\n\n");
{
    boolean var_testvariable1 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable1) {
        out.write("<div class=\"ttac\">\n  ");
        {
            Object var_testvariable2 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
            if (renderContext.getObjectModel().toBoolean(var_testvariable2)) {
                out.write("<img");
                {
                    Object var_attrvalue3 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
                    {
                        Object var_attrcontent4 = renderContext.call("xss", var_attrvalue3, "uri");
                        {
                            Object var_shoulddisplayattr6 = ((renderContext.getObjectModel().toBoolean(var_attrcontent4) ? var_attrcontent4 : ("false".equals(var_attrvalue3))));
                            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr6)) {
                                out.write(" src");
                                {
                                    boolean var_istrueattr5 = (var_attrvalue3.equals(true));
                                    if (!var_istrueattr5) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent4));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write("/>");
            }
        }
        out.write("\n  ");
        {
            Object var_testvariable7 = renderContext.getObjectModel().resolveProperty(_global_model, "title");
            if (renderContext.getObjectModel().toBoolean(var_testvariable7)) {
                out.write("<h2 class=\"ttac__title\">");
                {
                    Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
                    out.write(renderContext.getObjectModel().toString(var_8));
                }
                out.write("</h2>");
            }
        }
        out.write("\n  ");
        {
            Object var_testvariable9 = renderContext.getObjectModel().resolveProperty(_global_model, "text");
            if (renderContext.getObjectModel().toBoolean(var_testvariable9)) {
                out.write("<div class=\"ttac__text\">");
                {
                    Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
                    out.write(renderContext.getObjectModel().toString(var_10));
                }
                out.write("</div>");
            }
        }
        out.write("\n  ");
        {
            Object var_testvariable11 = renderContext.getObjectModel().resolveProperty(_global_model, "ctaHref");
            if (renderContext.getObjectModel().toBoolean(var_testvariable11)) {
                out.write("<a class=\"ttac__cta\"");
                {
                    Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(_global_model, "ctaHref");
                    {
                        Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                        {
                            Object var_shoulddisplayattr15 = ((renderContext.getObjectModel().toBoolean(var_attrcontent13) ? var_attrcontent13 : ("false".equals(var_attrvalue12))));
                            if (renderContext.getObjectModel().toBoolean(var_shoulddisplayattr15)) {
                                out.write(" href");
                                {
                                    boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                                    if (!var_istrueattr14) {
                                        out.write("=\"");
                                        out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                        out.write("\"");
                                    }
                                }
                            }
                        }
                    }
                }
                out.write(">");
                {
                    String var_16 = (("\n    " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "ctaText"), "text"))) + "\n  ");
                    out.write(renderContext.getObjectModel().toString(var_16));
                }
                out.write("</a>");
            }
        }
        out.write("\n</div>");
    }
}
out.write("\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

