/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package jakarta.faces.component;

import jakarta.faces.component.UIComponent;
import jakarta.faces.component.UIComponentBase;
import jakarta.faces.component.UIPanel;

/**
 * <p>
 * <strong>UIPanel</strong> is a {@link UIComponent} that manages the layout of its child components.
 * </p>
 */
public class UIPanel extends UIComponentBase {

    // ------------------------------------------------------ Manifest Constants

    /**
     * <p>
     * The standard component type for this component.
     * </p>
     */
    public static final String COMPONENT_TYPE = "jakarta.faces.Panel";

    /**
     * <p>
     * The standard component family for this component.
     * </p>
     */
    public static final String COMPONENT_FAMILY = "jakarta.faces.Panel";

    // ------------------------------------------------------------ Constructors

    /**
     * <p>
     * Create a new {@link UIPanel} instance with default property values.
     * </p>
     */
    public UIPanel() {
        super();
        setRendererType(null);
    }

    // -------------------------------------------------- UIComponent Properties

    @Override
    public String getFamily() {
        return COMPONENT_FAMILY;
    }

}
