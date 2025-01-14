package io.github.tnas.sci4j.colt.matrix.linalg;

import org.junit.jupiter.api.Test;

import cern.colt.matrix.impl.DenseDoubleMatrix2D;
import cern.colt.matrix.linalg.EigenvalueDecomposition;

class EigenvalueDecompositionTest {

	@Test
	void EigenvalueDecompositionTest() {
		
		var matrixEntries = new double[][] { { 16, -24, 18 }, { 3, -2, 0 }, { -9, 18, -17 } };
		var eigenDecomposition = new EigenvalueDecomposition(new DenseDoubleMatrix2D(matrixEntries));
		System.out.println(eigenDecomposition.toString());
	}

}
