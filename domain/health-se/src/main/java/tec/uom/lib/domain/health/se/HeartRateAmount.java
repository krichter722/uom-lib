/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright 2013-2014, Jean-Marie Dautelle, Werner Keil, V2COM and individual
 *  contributors by the @author tag.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package tec.uom.lib.domain.health.se;

import javax.measure.Unit;

import tec.uom.lib.domain.health.HeartRate;
import tec.uom.se.quantity.BaseQuantity;

/**
 * Represents the speed of heart beat. The standard unit for this quantity is
 * "bpm" (Beats per Minute).
 *
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 0.3.1, Date: 2014-10-01
 */
public final class HeartRateAmount extends BaseQuantity<HeartRate> implements
		HeartRate {

	/**
	 *
	 */
	private static final long serialVersionUID = -7105140153324121388L;
	
	// of() won't work here due to being defined in BaseQuantity ;-|
	public HeartRateAmount(Number number, Unit<HeartRate> unit) {
		super(number, unit);
	}
}
