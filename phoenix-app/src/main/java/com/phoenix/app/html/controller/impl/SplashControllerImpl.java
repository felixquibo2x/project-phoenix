/**
 *  Copyright (c) 2012 Ateneo Cipher Manics
 *
 *  This software is provided 'as-is', without any express or implied warranty. In no event will the authors
 *  be held liable for any damages arising from the use of this software.
 *
 *  Permission is granted to anyone to use this software for any purpose, including commercial applications,
 *  and to alter it and redistribute it freely, subject to the following restrictions:
 * 
 *      1. The origin of this software must not be misrepresented; you must not claim that you wrote the 
 *      original software. If you use this software in a product, an acknowledgment in the product 
 *      documentation would be appreciated but is not required.
 *
 *      2. Altered source versions must be plainly marked as such, and must not be misrepresented as being the 
 *      original software.
 *
 *      3. This notice may not be removed or altered from any source distribution.
 */

package com.phoenix.app.html.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.phoenix.app.html.controller.SplashController;

/**
 * @author raniejade
 */
@Controller
public class SplashControllerImpl implements SplashController {
    private static final Logger _LOG = LoggerFactory.getLogger(SplashControllerImpl.class);

    @Override
    public ModelAndView redirect() {
        _LOG.info("Redirecting to login page....");

        return new ModelAndView("index");
    }
}
