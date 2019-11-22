/*
 * The MIT License
 *
 * Copyright 2019 gfoster.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package sim.Layers;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author gfoster
 */
public class LandLayer extends MatrixLayer {

	/* 
	 * The cellWidth is static so that we don't need to store a reference
	 * with each SimObject back to the layer that the SimObject belongs to 
	 */
    protected static int cellWidth;
    
    public LandLayer(GraphicsContext gContext, double width, double height, int cellWidth) {
        super(gContext, width, height, cellWidth);
        LandLayer.cellWidth = cellWidth;
    }
    
    public static int cellWidth() {return cellWidth;}

} // end of class LandLayer
