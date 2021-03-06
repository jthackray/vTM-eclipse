/*******************************************************************************
 * Copyright (C) 2015 Brocade Communications Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * https://github.com/brocade/vTM-eclipse/LICENSE
 * This software is distributed "AS IS".
 *
 * Contributors:
 *     Brocade Communications Systems - Main Implementation
 ******************************************************************************/

package com.zeus.eclipsePlugin.editor.presentation;

import org.eclipse.jface.text.rules.IWordDetector;

/**
 * Detector that matches TrafficScript variables (e.g. $foo, $bar)
 */
public class VariableDetecter implements IWordDetector
{

   /* Override */
   public boolean isWordPart( char c )
   {
      return Character.isLetterOrDigit( c ) || c == '_';
   }

   /* Override */
   public boolean isWordStart( char c )
   {
      return c == '$';
   }

}
