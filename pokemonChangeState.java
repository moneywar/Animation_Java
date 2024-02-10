import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class pokemonChangeState {
    // beforeEvo
    int beforeEvoAnimationState = 0;

    // elolution
    int evoState = 0;
    int time = 0;
    double scale = 1;

    public BufferedImage beforeEvo(BufferedImage[] buffer) { // Animation Before evolve
        if(beforeEvoAnimationState == 0) { // First image
            beforeEvoAnimationState++;
            return buffer[0];
        } else if(beforeEvoAnimationState == 1) { // Second image
            beforeEvoAnimationState++;
            return buffer[1];
        } else if(beforeEvoAnimationState == 2) { // third image
            beforeEvoAnimationState = 0;
            return buffer[2];
        }

        return buffer[0]; // Return first image if have something wrong
    }

    public BufferedImage elolution(BufferedImage beforeEvoBuffer, BufferedImage AfterEvoBuffer) {
        // Make buffer scale up or down at middle
        AffineTransform a = new AffineTransform(1, 0, 0, 1, 300, 300);
        AffineTransform b = new AffineTransform(scale, 0, 0, scale, 0, 0);
        AffineTransform c = new AffineTransform(1, 0, 0, 1, -300, -300);
        AffineTransform result = new AffineTransform();
        result.concatenate(a);
        result.concatenate(b);
        result.concatenate(c);

        // Set new buffer before change transform
        BufferedImage after = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        AffineTransformOp scaleOp = new AffineTransformOp(result, AffineTransformOp.TYPE_BILINEAR);
        // Before evolve digda
        if (evoState == 0 && time <= 5) {
            after = scaleOp.filter(beforeEvoBuffer, after);
            scale -= 0.1;
            time += 1;
        } else if (time > 5) {
            evoState = 1;
        }

        // After evove digda
        if (evoState == 1 && time >= 0) {
            after = scaleOp.filter(AfterEvoBuffer, after);
            scale += 0.1;
            time -= 1;
        } else if (time < 0) {
            evoState = 0;
        }

        return after;
    }
}
