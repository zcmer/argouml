/* $Id: TestUmlModel.java 17766 2010-01-11 21:21:20Z linus $
 *****************************************************************************
 * Copyright (c) 2009 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    tfmorris
 *****************************************************************************
 *
 * Some portions of this file was previously release using the BSD License:
 */

// Copyright (c) 2003-2007 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.model;

/**
 * @author Thierry Lach
 */
public class TestUmlModel extends GenericUmlObjectTestFixture {
    /**
     * Constructor.
     *
     * @param arg0 test name
     */
    public TestUmlModel(String arg0) {
	super(arg0);
	setEntity(Model.getMetaTypes().getModel());
	validateTestClassIsGeneric(this);
    }

    /**
     * Test the creation of a namespace.
     */
    public void testNamespace() {
	Object o =
	    Model.getUmlFactory().buildNode(Model.getMetaTypes().getModel());
	assertNotNull("Didn't create object", o);
	assertTrue("Should be a base", Model.getFacade().isAUMLElement(o));
	assertTrue("Should be a model", Model.getFacade().isAModel(o));
	runTruthTests(o);
    }

    /*
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        setTruth(Model.getMetaTypes().getModelElement(), true);
        setTruth(Model.getMetaTypes().getGeneralizableElement(), true);
        setTruth(Model.getMetaTypes().getNamespace(), true);
        setTruth(Model.getMetaTypes().getPackage(), true);
        setTruth(Model.getMetaTypes().getModel(), true);
    }
}
