import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class drawPokemon {
    public static BufferedImage digda1() {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buffer.createGraphics();
        Color outline = new Color(0, 0, 1);
        Tools.setStroke(2);
        g.setColor(outline);
        // outline
        Tools.cubicBezier(g, 199, 247, 220, 101, 403, 137, 403, 247);
        Tools.cubicBezier(g, 199, 240, 199, 240, 199, 380, 199, 380);
        Tools.cubicBezier(g, 403, 245, 403, 247, 406, 380, 406, 380);

        // face
        Tools.cubicBezier(g, 269, 238, 335, 241, 317, 290, 269, 284);
        Tools.cubicBezier(g, 269, 238, 226, 234, 203, 285, 269, 284);
        // rock
        Tools.cubicBezier(g, 177, 362, 177, 356, 192, 358, 199, 358);
        Tools.cubicBezier(g, 150, 386, 145, 367, 177, 338, 191, 358);
        Tools.cubicBezier(g, 173, 366, 171, 379, 151, 385, 151, 383);
        Tools.cubicBezier(g, 151, 383, 152, 387, 143, 400, 141, 398);
        Tools.cubicBezier(g, 141, 399, 140, 400, 142, 410, 140, 410);
        Tools.cubicBezier(g, 140, 408, 132, 420, 144, 424, 155, 417);
        Tools.cubicBezier(g, 166, 402, 163, 399, 151, 413, 156, 417);
        Tools.cubicBezier(g, 166, 402, 174, 411, 164, 423, 156, 417);

        Tools.cubicBezier(g, 164, 417, 165, 425, 176, 417, 175, 431);
        Tools.cubicBezier(g, 212, 430, 201, 447, 187, 439, 175, 431);
        Tools.cubicBezier(g, 212, 430, 212, 426, 222, 434, 235, 431);
        Tools.cubicBezier(g, 262, 445, 243, 445, 248, 443, 235, 431);
        Tools.cubicBezier(g, 262, 445, 287, 459, 281, 431, 309, 445);
        Tools.cubicBezier(g, 307, 441, 312, 430, 335, 433, 337, 441);
        Tools.cubicBezier(g, 307, 441, 304, 450, 339, 447, 337, 441);

        Tools.cubicBezier(g, 328, 447, 336, 449, 344, 453, 350, 443);
        Tools.cubicBezier(g, 377, 445, 366, 445, 371, 440, 350, 443);
        Tools.cubicBezier(g, 377, 445, 379, 433, 386, 435, 390, 448);
        Tools.cubicBezier(g, 377, 445, 440, 456, 376, 426, 441, 431);
        Tools.cubicBezier(g, 427, 426, 407, 418, 407, 403, 433, 416);
        Tools.cubicBezier(g, 427, 426, 448, 435, 456, 427, 433, 416);

        Tools.cubicBezier(g, 415, 401, 396, 392, 400, 402, 411, 407);
        Tools.cubicBezier(g, 415, 401, 433, 410, 422, 413, 411, 407);

        Tools.cubicBezier(g, 445, 422, 438, 410, 479, 421, 453, 397);
        Tools.cubicBezier(g, 445, 382, 452, 385, 454, 393, 453, 397);
        Tools.cubicBezier(g, 449, 385, 451, 375, 437, 361, 422, 364);
        Tools.cubicBezier(g, 405, 355, 416, 352, 423, 363, 429, 372);

        // rock inside line
        Tools.cubicBezier(g, 195, 384, 202, 381, 206, 368, 217, 378);
        Tools.cubicBezier(g, 201, 410, 225, 394, 220, 382, 217, 378);
        Tools.cubicBezier(g, 201, 410, 190, 417, 183, 412, 181, 410);
        Tools.cubicBezier(g, 181, 410, 177, 405, 179, 396, 195, 384);
        Tools.cubicBezier(g, 180, 402, 170, 426, 188, 421, 194, 413);

        Tools.cubicBezier(g, 215, 377, 230, 376, 218, 394, 231, 397);
        Tools.cubicBezier(g, 241, 394, 256, 394, 255, 410, 242, 413);
        Tools.cubicBezier(g, 241, 394, 220, 394, 227, 418, 242, 413);

        Tools.cubicBezier(g, 252, 402, 255, 398, 264, 382, 281, 392);
        Tools.cubicBezier(g, 252, 402, 255, 398, 264, 382, 281, 392);
        Tools.cubicBezier(g, 296, 425, 307, 400, 295, 393, 281, 392);
        Tools.cubicBezier(g, 262, 391, 246, 404, 267, 432, 285, 431);
        Tools.cubicBezier(g, 282, 408, 273, 412, 277, 430, 291, 431);
        Tools.cubicBezier(g, 282, 408, 291, 404, 300, 432, 291, 431);

        Tools.cubicBezier(g, 290, 394, 321, 421, 307, 399, 323, 394);
        Tools.cubicBezier(g, 345, 390, 285, 390, 346, 424, 357, 417);
        Tools.cubicBezier(g, 345, 390, 390, 380, 394, 428, 375, 416);
        Tools.cubicBezier(g, 356, 416, 367, 407, 377, 411, 378, 421);
        Tools.cubicBezier(g, 356, 416, 357, 421, 379, 424, 378, 421);

        Tools.cubicBezier(g, 376, 395, 393, 403, 373, 375, 408, 380);
        Tools.cubicBezier(g, 410, 382, 390, 371, 388, 388, 408, 393);
        Tools.cubicBezier(g, 410, 382, 437, 395, 426, 398, 408, 393);
        Tools.floodFill(g, buffer, 301, 265, new Color(190, 133, 165));
        Tools.floodFill(g, buffer, 342, 277, new Color(186, 153, 126));
        // rock
        Color filledcolor = new Color(200, 201, 200);
        Tools.floodFill(g, buffer, 200, 400, filledcolor);
        Tools.floodFill(g, buffer, 270, 400, filledcolor);
        Tools.floodFill(g, buffer, 288, 419, filledcolor);
        Tools.floodFill(g, buffer, 371, 416, filledcolor);
        Tools.floodFill(g, buffer, 381, 442, filledcolor);
        Tools.floodFill(g, buffer, 411, 387, filledcolor);

        filledcolor = new Color(206, 210, 211);
        Tools.floodFill(g, buffer, 244, 400, filledcolor);
        Tools.floodFill(g, buffer, 270, 400, filledcolor);
        Tools.floodFill(g, buffer, 350, 400, filledcolor);
        Tools.floodFill(g, buffer, 411, 404, filledcolor);
        Tools.floodFill(g, buffer, 427, 420, filledcolor);
        Tools.floodFill(g, buffer, 163, 415, filledcolor);
        Tools.floodFill(g, buffer, 182, 417, filledcolor);
        Tools.floodFill(g, buffer, 318, 441, filledcolor);

        filledcolor = new Color(169, 171, 178);
        Tools.floodFill(g, buffer, 300, 430, filledcolor);

        // nose
        filledcolor = new Color(236, 191, 215);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 265, 240, 213, 244, 236, 268, 265, 268);
        Tools.cubicBezier(g, 265, 240, 317, 236, 306, 268, 265, 268);
        Tools.floodFill(g, buffer, 258, 250, filledcolor);

        filledcolor = new Color(249, 237, 244);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 252, 248, 243, 248, 239, 255, 252, 255);
        Tools.cubicBezier(g, 252, 248, 265, 248, 265, 255, 252, 255);
        Tools.floodFill(g, buffer, 250, 250, filledcolor);

        // Body
        g.setColor(new Color(206, 184, 163));
        Tools.cubicBezier(g, 257, 159, 204, 195, 187, 231, 276, 202);
        Tools.cubicBezier(g, 257, 159, 310, 135, 364, 173, 276, 202);
        Tools.floodFill(g, buffer, 273, 170, new Color(206, 184, 163));

        filledcolor = new Color(157, 125, 102);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 247, 281, 281, 311, 327, 284, 312, 261);
        Tools.floodFill(g, buffer, 284, 287, filledcolor);

        // eye
        g.setColor(new Color(0, 0, 1));
        Tools.cubicBezier(g, 251, 197, 257, 193, 254, 236, 243, 231);
        Tools.cubicBezier(g, 309, 197, 319, 193, 315, 239, 307, 233);
        Tools.cubicBezier(g, 309, 197, 300, 195, 297, 238, 307, 233);
        Tools.cubicBezier(g, 251, 197, 242, 194, 237, 233, 243, 231);
        Tools.floodFill(g, buffer, 310, 216, new Color(0, 0, 1));
        Tools.floodFill(g, buffer, 248, 205, new Color(0, 0, 1));
        Tools.floodFill(g, buffer, 246, 220, new Color(0, 0, 1));

        g.setColor(Color.WHITE);
        Tools.cubicBezier(g, 248, 199, 244, 206, 249, 207, 252, 204);
        Tools.cubicBezier(g, 248, 199, 250, 196, 255, 202, 252, 204);
        Tools.floodFill(g, buffer, 250, 202, Color.WHITE);
        Tools.cubicBezier(g, 307, 199, 302, 206, 309, 208, 312, 205);
        Tools.cubicBezier(g, 307, 199, 309, 195, 315, 201, 312, 205);
        Tools.floodFill(g, buffer, 309, 203, Color.WHITE);

        return buffer;
    }

    public static BufferedImage digda2() {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buffer.createGraphics();
        Tools.setStroke(2);
        Color outline = new Color(0, 0, 1);
        g.setColor(outline);
        // outline
        Tools.cubicBezier(g, 207, 239, 218, 87, 398, 116, 393, 239);
        Tools.cubicBezier(g, 207, 235, 207, 235, 207, 375, 207, 375);
        Tools.cubicBezier(g, 393, 239, 393, 239, 393, 380, 393, 380);

        // face
        Tools.cubicBezier(g, 272, 226, 216, 226, 231, 272, 275, 271);
        Tools.cubicBezier(g, 272, 226, 315, 226, 325, 270, 275, 271);
        // rock
        Tools.cubicBezier(g, 199, 358, 199, 358, 207, 358, 207, 358);
        Tools.cubicBezier(g, 177, 362, 177, 356, 192, 358, 199, 358);
        Tools.cubicBezier(g, 150, 386, 145, 367, 177, 338, 191, 358);
        Tools.cubicBezier(g, 173, 366, 171, 379, 151, 385, 151, 383);
        Tools.cubicBezier(g, 151, 383, 152, 387, 143, 400, 141, 398);
        Tools.cubicBezier(g, 141, 399, 140, 400, 142, 410, 140, 410);
        Tools.cubicBezier(g, 140, 408, 132, 420, 144, 424, 155, 417);
        Tools.cubicBezier(g, 166, 402, 163, 399, 151, 413, 156, 417);
        Tools.cubicBezier(g, 166, 402, 174, 411, 164, 423, 156, 417);

        Tools.cubicBezier(g, 164, 417, 165, 425, 176, 417, 175, 431);
        Tools.cubicBezier(g, 212, 430, 201, 447, 187, 439, 175, 431);
        Tools.cubicBezier(g, 212, 430, 212, 426, 222, 434, 235, 431);
        Tools.cubicBezier(g, 262, 445, 243, 445, 248, 443, 235, 431);
        Tools.cubicBezier(g, 262, 445, 287, 459, 281, 431, 309, 445);
        Tools.cubicBezier(g, 307, 441, 312, 430, 335, 433, 337, 441);
        Tools.cubicBezier(g, 307, 441, 304, 450, 339, 447, 337, 441);

        Tools.cubicBezier(g, 328, 447, 336, 449, 344, 453, 350, 443);
        Tools.cubicBezier(g, 377, 445, 366, 445, 371, 440, 350, 443);
        Tools.cubicBezier(g, 377, 445, 379, 433, 386, 435, 390, 448);
        Tools.cubicBezier(g, 377, 445, 440, 456, 376, 426, 441, 431);
        Tools.cubicBezier(g, 427, 426, 407, 418, 407, 403, 433, 416);
        Tools.cubicBezier(g, 427, 426, 448, 435, 456, 427, 433, 416);

        Tools.cubicBezier(g, 415, 401, 396, 392, 400, 402, 411, 407);
        Tools.cubicBezier(g, 415, 401, 433, 410, 422, 413, 411, 407);

        Tools.cubicBezier(g, 445, 422, 438, 410, 479, 421, 453, 397);
        Tools.cubicBezier(g, 445, 382, 452, 385, 454, 393, 453, 397);
        Tools.cubicBezier(g, 449, 385, 451, 375, 437, 361, 422, 364);
        Tools.cubicBezier(g, 405, 355, 416, 352, 423, 363, 429, 372);
        Tools.cubicBezier(g, 393, 355, 393, 355, 405, 355, 405, 355);

        // rock inside line
        Tools.cubicBezier(g, 195, 384, 202, 381, 206, 368, 217, 378);
        Tools.cubicBezier(g, 201, 410, 225, 394, 220, 382, 217, 378);
        Tools.cubicBezier(g, 201, 410, 190, 417, 183, 412, 181, 410);
        Tools.cubicBezier(g, 181, 410, 177, 405, 179, 396, 195, 384);
        Tools.cubicBezier(g, 180, 402, 170, 426, 188, 421, 194, 413);

        Tools.cubicBezier(g, 215, 377, 230, 376, 218, 394, 231, 397);
        Tools.cubicBezier(g, 241, 394, 256, 394, 255, 410, 242, 413);
        Tools.cubicBezier(g, 241, 394, 220, 394, 227, 418, 242, 413);

        Tools.cubicBezier(g, 252, 402, 255, 398, 264, 382, 281, 392);
        Tools.cubicBezier(g, 252, 402, 255, 398, 264, 382, 281, 392);
        Tools.cubicBezier(g, 296, 425, 307, 400, 295, 393, 281, 392);
        Tools.cubicBezier(g, 262, 391, 246, 404, 267, 432, 285, 431);
        Tools.cubicBezier(g, 282, 408, 273, 412, 277, 430, 291, 431);
        Tools.cubicBezier(g, 282, 408, 291, 404, 300, 432, 291, 431);

        Tools.cubicBezier(g, 290, 394, 321, 421, 307, 399, 323, 394);
        Tools.cubicBezier(g, 345, 390, 285, 390, 346, 424, 357, 417);
        Tools.cubicBezier(g, 345, 390, 390, 380, 394, 428, 375, 416);
        Tools.cubicBezier(g, 356, 416, 367, 407, 377, 411, 378, 421);
        Tools.cubicBezier(g, 356, 416, 357, 421, 379, 424, 378, 421);

        Tools.cubicBezier(g, 376, 395, 393, 403, 373, 375, 408, 380);
        Tools.cubicBezier(g, 410, 382, 390, 371, 388, 388, 408, 393);
        Tools.cubicBezier(g, 410, 382, 437, 395, 426, 398, 408, 393);

        Tools.floodFill(g, buffer, 280, 250, new Color(190, 133, 165));
        Tools.floodFill(g, buffer, 240, 290, new Color(186, 153, 126));

        // rock
        Color filledcolor = new Color(200, 201, 200);

        Tools.floodFill(g, buffer, 200, 400, filledcolor);
        Tools.floodFill(g, buffer, 270, 400, filledcolor);
        Tools.floodFill(g, buffer, 288, 419, filledcolor);
        Tools.floodFill(g, buffer, 371, 416, filledcolor);
        Tools.floodFill(g, buffer, 381, 442, filledcolor);
        Tools.floodFill(g, buffer, 411, 387, filledcolor);

        filledcolor = new Color(206, 210, 211);
        Tools.floodFill(g, buffer, 244, 400, filledcolor);
        Tools.floodFill(g, buffer, 270, 400, filledcolor);
        Tools.floodFill(g, buffer, 350, 400, filledcolor);
        Tools.floodFill(g, buffer, 411, 404, filledcolor);
        Tools.floodFill(g, buffer, 427, 420, filledcolor);
        Tools.floodFill(g, buffer, 163, 415, filledcolor);
        Tools.floodFill(g, buffer, 182, 417, filledcolor);
        Tools.floodFill(g, buffer, 318, 441, filledcolor);

        filledcolor = new Color(169, 171, 178);
        Tools.floodFill(g, buffer, 300, 430, filledcolor);

        // nose
        filledcolor = new Color(236, 191, 215);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 266, 227, 230, 227, 237, 254, 269, 255);
        Tools.cubicBezier(g, 266, 227, 310, 227, 301, 255, 269, 255);
        Tools.floodFill(g, buffer, 258, 250, filledcolor);

        filledcolor = new Color(249, 237, 244);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 256, 233, 245, 235, 247, 242, 258, 240);
        Tools.cubicBezier(g, 256, 233, 269, 232, 269, 239, 258, 240);
        Tools.floodFill(g, buffer, 258, 236, filledcolor);

        // Body
        filledcolor = new Color(206, 184, 163);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 263, 143, 197, 182, 233, 204, 281, 183);
        Tools.cubicBezier(g, 263, 143, 360, 126, 332, 162, 281, 183);
        Tools.floodFill(g, buffer, 273, 170, filledcolor);

        filledcolor = new Color(157, 125, 102);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 247, 266, 272, 289, 322, 280, 310, 249);
        Tools.floodFill(g, buffer, 284, 274, filledcolor);

        // eye
        filledcolor = new Color(0, 0, 1);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 247, 200, 249, 177, 261, 173, 257, 197);
        Tools.cubicBezier(g, 247, 200, 245, 224, 258, 222, 257, 197);
        Tools.cubicBezier(g, 301, 201, 301, 178, 314, 174, 312, 201);
        Tools.cubicBezier(g, 301, 201, 298, 228, 313, 225, 312, 201);
        Tools.floodFill(g, buffer, 250, 200, filledcolor);
        Tools.floodFill(g, buffer, 308, 206, filledcolor);
        Tools.floodFill(g, buffer, 253, 187, filledcolor);

        g.setColor(Color.WHITE);
        Tools.cubicBezier(g, 251, 188, 251, 196, 256, 193, 256, 188);
        Tools.cubicBezier(g, 251, 188, 251, 185, 256, 179, 256, 188);
        Tools.floodFill(g, buffer, 253, 188, Color.WHITE);
        Tools.cubicBezier(g, 304, 189, 302, 194, 309, 196, 310, 190);
        Tools.cubicBezier(g, 304, 189, 305, 184, 311, 183, 310, 190);
        Tools.floodFill(g, buffer, 307, 189, Color.WHITE);

        return buffer;
    }

    public static BufferedImage digda3() {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buffer.createGraphics();
        Tools.setStroke(2);
        Color outline = new Color(0, 0, 1);
        g.setColor(outline);
        // outline
        Tools.cubicBezier(g, 187, 273, 187, 138, 412, 131, 412, 273);

        Tools.cubicBezier(g, 187, 273, 187, 187, 187, 390, 187, 390);
        Tools.cubicBezier(g, 412, 273, 412, 273, 412, 382, 412, 382);

        // face
        Tools.cubicBezier(g, 267, 253, 190, 252, 222, 300, 272, 296);
        Tools.cubicBezier(g, 267, 253, 352, 252, 316, 301, 272, 296);
        // rock
        Tools.cubicBezier(g, 177, 362, 177, 356, 192, 358, 187, 358);
        Tools.cubicBezier(g, 150, 386, 145, 367, 177, 338, 187, 354);
        Tools.cubicBezier(g, 173, 366, 171, 379, 151, 385, 151, 383);
        Tools.cubicBezier(g, 151, 383, 152, 387, 143, 400, 141, 398);
        Tools.cubicBezier(g, 141, 399, 140, 400, 142, 410, 140, 410);
        Tools.cubicBezier(g, 140, 408, 132, 420, 144, 424, 155, 417);
        Tools.cubicBezier(g, 166, 402, 163, 399, 151, 413, 156, 417);
        Tools.cubicBezier(g, 166, 402, 174, 411, 164, 423, 156, 417);

        Tools.cubicBezier(g, 164, 417, 165, 425, 176, 417, 175, 431);
        Tools.cubicBezier(g, 212, 430, 201, 447, 187, 439, 175, 431);
        Tools.cubicBezier(g, 212, 430, 212, 426, 222, 434, 235, 431);
        Tools.cubicBezier(g, 262, 445, 243, 445, 248, 443, 235, 431);
        Tools.cubicBezier(g, 262, 445, 287, 459, 281, 431, 309, 445);
        Tools.cubicBezier(g, 307, 441, 312, 430, 335, 433, 337, 441);
        Tools.cubicBezier(g, 307, 441, 304, 450, 339, 447, 337, 441);

        Tools.cubicBezier(g, 328, 447, 336, 449, 344, 453, 350, 443);
        Tools.cubicBezier(g, 377, 445, 366, 445, 371, 440, 350, 443);
        Tools.cubicBezier(g, 377, 445, 379, 433, 386, 435, 390, 448);
        Tools.cubicBezier(g, 377, 445, 440, 456, 376, 426, 441, 431);
        Tools.cubicBezier(g, 427, 426, 407, 418, 407, 403, 433, 416);
        Tools.cubicBezier(g, 427, 426, 448, 435, 456, 427, 433, 416);

        Tools.cubicBezier(g, 415, 401, 396, 392, 400, 402, 411, 407);
        Tools.cubicBezier(g, 415, 401, 433, 410, 422, 413, 411, 407);

        Tools.cubicBezier(g, 445, 422, 438, 410, 479, 421, 453, 397);
        Tools.cubicBezier(g, 445, 382, 452, 385, 454, 393, 453, 397);
        Tools.cubicBezier(g, 449, 385, 451, 375, 437, 361, 422, 364);
        Tools.cubicBezier(g, 412, 355, 416, 352, 423, 363, 429, 372);

        // rock inside line
        Tools.cubicBezier(g, 195, 384, 202, 381, 206, 368, 217, 378);
        Tools.cubicBezier(g, 201, 410, 225, 394, 220, 382, 217, 378);
        Tools.cubicBezier(g, 201, 410, 190, 417, 183, 412, 181, 410);
        Tools.cubicBezier(g, 181, 410, 177, 405, 179, 396, 195, 384);
        Tools.cubicBezier(g, 180, 402, 170, 426, 188, 421, 194, 413);

        Tools.cubicBezier(g, 215, 377, 230, 376, 218, 394, 231, 397);
        Tools.cubicBezier(g, 241, 394, 256, 394, 255, 410, 242, 413);
        Tools.cubicBezier(g, 241, 394, 220, 394, 227, 418, 242, 413);

        Tools.cubicBezier(g, 252, 402, 255, 398, 264, 382, 281, 392);
        Tools.cubicBezier(g, 252, 402, 255, 398, 264, 382, 281, 392);
        Tools.cubicBezier(g, 296, 425, 307, 400, 295, 393, 281, 392);
        Tools.cubicBezier(g, 262, 391, 246, 404, 267, 432, 285, 431);
        Tools.cubicBezier(g, 282, 408, 273, 412, 277, 430, 291, 431);
        Tools.cubicBezier(g, 282, 408, 291, 404, 300, 432, 291, 431);

        Tools.cubicBezier(g, 290, 394, 321, 421, 307, 399, 323, 394);
        Tools.cubicBezier(g, 345, 390, 285, 390, 346, 424, 357, 417);
        Tools.cubicBezier(g, 345, 390, 390, 380, 394, 428, 375, 416);
        Tools.cubicBezier(g, 356, 416, 367, 407, 377, 411, 378, 421);
        Tools.cubicBezier(g, 356, 416, 357, 421, 379, 424, 378, 421);

        Tools.cubicBezier(g, 376, 395, 393, 403, 373, 375, 408, 380);
        Tools.cubicBezier(g, 410, 382, 390, 371, 388, 388, 408, 393);
        Tools.cubicBezier(g, 410, 382, 437, 395, 426, 398, 408, 393);

        Tools.floodFill(g, buffer, 263, 270, new Color(190, 133, 165));
        Tools.floodFill(g, buffer, 260, 320, new Color(186, 153, 126));

        // rock
        Color filledcolor = new Color(200, 201, 200);

        Tools.floodFill(g, buffer, 200, 400, filledcolor);
        Tools.floodFill(g, buffer, 270, 400, filledcolor);
        Tools.floodFill(g, buffer, 288, 419, filledcolor);
        Tools.floodFill(g, buffer, 371, 416, filledcolor);
        Tools.floodFill(g, buffer, 381, 442, filledcolor);
        Tools.floodFill(g, buffer, 411, 387, filledcolor);

        filledcolor = new Color(206, 210, 211);
        Tools.floodFill(g, buffer, 244, 400, filledcolor);
        Tools.floodFill(g, buffer, 270, 400, filledcolor);
        Tools.floodFill(g, buffer, 350, 400, filledcolor);
        Tools.floodFill(g, buffer, 411, 404, filledcolor);
        Tools.floodFill(g, buffer, 427, 420, filledcolor);
        Tools.floodFill(g, buffer, 163, 415, filledcolor);
        Tools.floodFill(g, buffer, 182, 417, filledcolor);
        Tools.floodFill(g, buffer, 318, 441, filledcolor);

        filledcolor = new Color(169, 171, 178);
        Tools.floodFill(g, buffer, 300, 430, filledcolor);

        // nose
        filledcolor = new Color(236, 191, 215);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 260, 253, 206, 255, 224, 282, 261, 280);
        Tools.cubicBezier(g, 260, 253, 312, 251, 303, 277, 261, 280);
        Tools.floodFill(g, buffer, 258, 270, filledcolor);

        filledcolor = new Color(249, 237, 244);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 246, 260, 230, 261, 239, 268, 247, 268);
        Tools.cubicBezier(g, 246, 260, 261, 259, 259, 268, 247, 268);
        Tools.floodFill(g, buffer, 247, 264, filledcolor);

        // Body
        filledcolor = new Color(206, 184, 163);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 266, 173, 177, 210, 188, 250, 285, 215);
        Tools.cubicBezier(g, 266, 173, 344, 166, 356, 189, 285, 215);
        Tools.floodFill(g, buffer, 273, 185, filledcolor);

        filledcolor = new Color(157, 125, 102);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 241, 292, 297, 320, 324, 286, 320, 275);
        Tools.floodFill(g, buffer, 295, 297, filledcolor);

        // eye
        filledcolor = new Color(0, 0, 1);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 235, 228, 239, 212, 251, 200, 248, 229);
        Tools.cubicBezier(g, 235, 228, 233, 257, 250, 247, 248, 229);
        Tools.cubicBezier(g, 300, 232, 305, 202, 317, 211, 315, 231);
        Tools.cubicBezier(g, 300, 232, 301, 261, 318, 248, 315, 231);
        Tools.floodFill(g, buffer, 241, 230, filledcolor);
        Tools.floodFill(g, buffer, 308, 230, filledcolor);
        Tools.floodFill(g, buffer, 244, 217, filledcolor);

        g.setColor(Color.WHITE);
        Tools.cubicBezier(g, 240, 217, 238, 222, 243, 225, 246, 220);
        Tools.cubicBezier(g, 240, 217, 243, 210, 249, 216, 246, 220);
        Tools.floodFill(g, buffer, 243, 219, Color.WHITE);
        Tools.cubicBezier(g, 306, 217, 301, 223, 310, 224, 312, 222);
        Tools.cubicBezier(g, 306, 217, 311, 210, 314, 220, 312, 222);
        Tools.floodFill(g, buffer, 308, 219, Color.WHITE);

        return buffer;
    }

    public static BufferedImage evodigda() {
        BufferedImage buffer = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = buffer.createGraphics();
        Tools.setStroke(1);
        Color outline = new Color(0, 0, 1);
        g.setColor(outline);
        // right-hand
        Tools.cubicBezier(g, 81, 176, 77, 175, 50, 189, 58, 218);
        Tools.cubicBezier(g, 81, 176, 87, 180, 84, 168, 91, 169);
        Tools.cubicBezier(g, 101, 162, 99, 161, 96, 170, 91, 169);
        Tools.cubicBezier(g, 101, 162, 112, 166, 123, 159, 125, 157);
        g.drawLine(125, 157, 136, 181);
        Tools.cubicBezier(g, 136, 181, 141, 182, 146, 188, 145, 198);
        Tools.cubicBezier(g, 146, 212, 150, 207, 146, 197, 145, 198);

        g.drawLine(142, 205, 136, 181);
        Tools.cubicBezier(g, 142, 205, 139, 213, 128, 212, 127, 209);
        g.drawLine(117, 175, 127, 199);
        g.drawLine(127, 214, 127, 199);

        g.drawLine(101, 180, 108, 199);
        g.drawLine(113, 217, 108, 199);
        Tools.cubicBezier(g, 127, 214, 126, 221, 114, 221, 113, 217);

        g.drawLine(82, 188, 95, 226);
        g.drawLine(66, 206, 73, 229);
        Tools.cubicBezier(g, 113, 217, 114, 223, 97, 233, 95, 226);
        Tools.cubicBezier(g, 73, 229, 82, 236, 95, 226, 95, 226);

        // right arm
        Tools.cubicBezier(g, 74, 300, 74, 287, 62, 219, 58, 218);
        Tools.cubicBezier(g, 74, 300, 74, 304, 89, 310, 92, 308);
        Tools.cubicBezier(g, 163, 359, 146, 364, 98, 346, 92, 308);
        Tools.cubicBezier(g, 163, 359, 176, 385, 201, 392, 228, 389);
        Tools.cubicBezier(g, 276, 439, 276, 419, 267, 401, 228, 389);

        Tools.cubicBezier(g, 146, 212, 120, 229, 120, 237, 137, 245);
        Tools.cubicBezier(g, 213, 265, 209, 238, 166, 234, 137, 245);
        Tools.cubicBezier(g, 166, 241, 183, 238, 175, 245, 201, 233);
        Tools.cubicBezier(g, 237, 240, 217, 229, 218, 222, 201, 233);
        Tools.cubicBezier(g, 237, 240, 247, 247, 256, 244, 267, 238);

        Tools.cubicBezier(g, 87, 241, 85, 246, 102, 293, 108, 297);
        Tools.cubicBezier(g, 97, 236, 93, 257, 114, 294, 118, 294);
        Tools.cubicBezier(g, 108, 236, 108, 242, 120, 259, 125, 255);
        Tools.cubicBezier(g, 132, 302, 156, 339, 195, 308, 201, 300);
        Tools.cubicBezier(g, 173, 318, 180, 316, 209, 320, 218, 331);
        Tools.cubicBezier(g, 196, 325, 195, 357, 231, 379, 246, 382);
        Tools.cubicBezier(g, 163, 338, 167, 347, 208, 366, 208, 357);
        Tools.cubicBezier(g, 202, 247, 202, 245, 206, 240, 213, 240);

        // head
        Tools.cubicBezier(g, 271, 220, 273, 234, 269, 238, 267, 238);
        Tools.cubicBezier(g, 271, 220, 267, 189, 307, 195, 309, 222);

        // left-arm
        Tools.cubicBezier(g, 319, 234, 318, 227, 313, 237, 309, 222);
        Tools.cubicBezier(g, 319, 234, 325, 247, 337, 237, 346, 236);
        Tools.cubicBezier(g, 374, 241, 362, 240, 361, 230, 346, 236);
        Tools.cubicBezier(g, 374, 241, 373, 241, 384, 243, 391, 249);
        Tools.cubicBezier(g, 442, 249, 429, 240, 398, 239, 391, 249);
        Tools.cubicBezier(g, 442, 249, 447, 218, 453, 241, 445, 215);

        Tools.cubicBezier(g, 478, 205, 485, 209, 493, 243, 494, 249);
        Tools.cubicBezier(g, 493, 279, 504, 268, 496, 254, 494, 249);
        Tools.cubicBezier(g, 493, 279, 482, 291, 467, 309, 464, 318);
        Tools.cubicBezier(g, 443, 342, 451, 338, 461, 326, 464, 318);
        Tools.cubicBezier(g, 443, 342, 434, 346, 432, 355, 430, 360);
        Tools.cubicBezier(g, 420, 372, 420, 367, 429, 365, 430, 360);
        Tools.cubicBezier(g, 420, 372, 420, 377, 409, 383, 405, 396);
        Tools.cubicBezier(g, 400, 432, 399, 421, 402, 410, 405, 396);

        // Body
        Tools.cubicBezier(g, 269, 236, 267, 240, 255, 250, 249, 251);
        Tools.cubicBezier(g, 230, 259, 235, 262, 266, 251, 268, 247);
        Tools.cubicBezier(g, 232, 271, 241, 270, 263, 257, 274, 247);
        Tools.cubicBezier(g, 270, 243, 275, 251, 300, 261, 311, 258);

        Tools.cubicBezier(g, 324, 240, 333, 243, 339, 247, 342, 245);
        Tools.cubicBezier(g, 353, 253, 344, 249, 345, 244, 342, 245);
        Tools.cubicBezier(g, 353, 253, 353, 253, 366, 257, 367, 261);
        Tools.cubicBezier(g, 323, 257, 331, 257, 328, 253, 342, 245);

        Tools.cubicBezier(g, 208, 288, 188, 317, 235, 350, 253, 352);
        Tools.cubicBezier(g, 342, 312, 301, 314, 324, 345, 253, 352);
        Tools.cubicBezier(g, 342, 312, 341, 265, 309, 266, 301, 269);
        Tools.cubicBezier(g, 328, 274, 328, 270, 337, 265, 340, 266);

        Tools.cubicBezier(g, 342, 312, 353, 310, 360, 322, 389, 323);
        Tools.cubicBezier(g, 394, 274, 417, 285, 421, 325, 389, 323);

        // right mus
        Tools.cubicBezier(g, 241, 348, 240, 363, 258, 375, 266, 377);
        Tools.cubicBezier(g, 259, 374, 255, 380, 263, 397, 271, 398);
        Tools.cubicBezier(g, 264, 353, 265, 360, 268, 375, 287, 371);
        Tools.cubicBezier(g, 271, 368, 267, 376, 276, 394, 293, 394);
        Tools.cubicBezier(g, 281, 395, 279, 405, 292, 418, 300, 419);
        Tools.cubicBezier(g, 285, 419, 282, 423, 281, 435, 285, 439);
        Tools.cubicBezier(g, 304, 420, 306, 423, 304, 438, 295, 441);
        Tools.cubicBezier(g, 289, 344, 287, 356, 300, 368, 315, 360);
        Tools.cubicBezier(g, 300, 362, 296, 372, 301, 384, 307, 383);
        Tools.cubicBezier(g, 310, 389, 301, 393, 305, 414, 316, 422);

        Tools.cubicBezier(g, 313, 327, 310, 336, 318, 349, 326, 345);
        Tools.cubicBezier(g, 325, 351, 321, 356, 325, 369, 328, 371);
        Tools.cubicBezier(g, 328, 371, 323, 374, 320, 398, 326, 401);
        Tools.cubicBezier(g, 329, 345, 331, 342, 339, 340, 344, 342);
        Tools.cubicBezier(g, 329, 371, 332, 369, 349, 367, 351, 369);
        Tools.cubicBezier(g, 329, 414, 336, 416, 346, 429, 346, 439);
        Tools.cubicBezier(g, 345, 316, 350, 320, 348, 335, 348, 337);
        Tools.cubicBezier(g, 346, 342, 351, 343, 354, 363, 353, 367);

        Tools.cubicBezier(g, 358, 365, 350, 374, 356, 392, 359, 392);
        Tools.cubicBezier(g, 359, 372, 361, 373, 362, 393, 359, 392);
        Tools.cubicBezier(g, 333, 401, 341, 407, 354, 403, 356, 397);

        Tools.cubicBezier(g, 354, 342, 388, 353, 380, 337, 375, 327);
        Tools.cubicBezier(g, 362, 366, 379, 373, 389, 366, 381, 350);
        Tools.cubicBezier(g, 362, 399, 378, 404, 389, 403, 384, 386);
        Tools.cubicBezier(g, 369, 432, 369, 427, 374, 407, 381, 407);

        Tools.cubicBezier(g, 406, 319, 410, 323, 417, 340, 406, 349);
        Tools.cubicBezier(g, 402, 398, 407, 393, 411, 348, 406, 349);

        // left arm
        Tools.cubicBezier(g, 406, 259, 399, 267, 407, 286, 408, 289);
        Tools.cubicBezier(g, 410, 291, 415, 305, 426, 312, 440, 306);
        Tools.cubicBezier(g, 432, 308, 421, 309, 413, 338, 423, 349);
        Tools.cubicBezier(g, 421, 350, 415, 352, 411, 364, 414, 373);
        Tools.cubicBezier(g, 442, 250, 457, 249, 474, 274, 458, 297);

        Tools.cubicBezier(g, 453, 218, 456, 225, 454, 242, 451, 245);
        Tools.cubicBezier(g, 461, 218, 458, 222, 463, 246, 466, 249);
        Tools.cubicBezier(g, 470, 212, 468, 218, 467, 265, 477, 274);

        // left hand
        Tools.cubicBezier(g, 445, 215, 431, 212, 429, 214, 430, 197);
        Tools.cubicBezier(g, 446, 180, 433, 176, 431, 180, 430, 197);
        Tools.cubicBezier(g, 446, 180, 450, 178, 450, 183, 452, 182);
        Tools.cubicBezier(g, 460, 182, 457, 180, 454, 182, 452, 182);
        Tools.cubicBezier(g, 460, 182, 464, 185, 465, 184, 466, 185);
        Tools.cubicBezier(g, 478, 205, 474, 193, 468, 186, 466, 185);

        Tools.cubicBezier(g, 430, 202, 431, 206, 438, 205, 440, 202);
        Tools.cubicBezier(g, 445, 186, 445, 186, 440, 198, 440, 202);
        Tools.cubicBezier(g, 448, 204, 446, 207, 440, 206, 440, 202);
        Tools.cubicBezier(g, 453, 191, 453, 191, 450, 201, 448, 204);
        Tools.cubicBezier(g, 452, 195, 452, 195, 450, 201, 450, 206);
        Tools.cubicBezier(g, 458, 206, 457, 209, 449, 210, 450, 206);
        Tools.cubicBezier(g, 458, 206, 459, 202, 460, 196, 462, 196);

        // Face
        Tools.cubicBezier(g, 300, 216, 309, 215, 313, 224, 300, 227);
        Tools.cubicBezier(g, 300, 216, 288, 218, 289, 228, 300, 227);
        Tools.cubicBezier(g, 298, 212, 296, 206, 299, 204, 301, 210);
        Tools.cubicBezier(g, 298, 212, 299, 216, 303, 217, 301, 210);
        Tools.cubicBezier(g, 286, 215, 285, 210, 288, 208, 290, 213);
        Tools.cubicBezier(g, 286, 215, 288, 221, 291, 218, 290, 213);

        Tools.cubicBezier(g, 278, 205, 278, 204, 289, 207, 293, 210);
        Tools.cubicBezier(g, 294, 209, 294, 207, 296, 200, 298, 199);

        // rock
        g.drawLine(233, 454, 264, 445);
        g.drawLine(274, 447, 264, 445);
        g.drawLine(274, 448, 276, 439);
        g.drawLine(294, 440, 276, 439);
        g.drawLine(294, 440, 296, 442);
        Tools.cubicBezier(g, 296, 442, 296, 442, 319, 437, 302, 459);
        Tools.cubicBezier(g, 305, 450, 313, 454, 335, 453, 338, 450);
        Tools.cubicBezier(g, 351, 437, 341, 440, 337, 440, 338, 450);
        Tools.cubicBezier(g, 351, 437, 362, 432, 365, 434, 366, 444);
        g.drawLine(374, 472, 366, 444);
        Tools.cubicBezier(g, 265, 469, 264, 444, 274, 445, 278, 450);
        Tools.cubicBezier(g, 338, 448, 338, 452, 340, 465, 346, 471);
        Tools.cubicBezier(g, 365, 437, 397, 412, 391, 430, 398, 454);
        Tools.cubicBezier(g, 393, 432, 401, 431, 403, 429, 423, 452);

        Tools.cubicBezier(g, 245, 436, 238, 440, 242, 445, 248, 441);
        Tools.cubicBezier(g, 245, 436, 252, 432, 254, 437, 248, 441);
        Tools.cubicBezier(g, 258, 428, 254, 431, 257, 435, 262, 433);
        Tools.cubicBezier(g, 258, 428, 261, 425, 268, 430, 262, 433);
        Tools.cubicBezier(g, 264, 441, 260, 444, 267, 448, 268, 445);
        Tools.cubicBezier(g, 264, 441, 268, 438, 270, 443, 268, 445);

        Tools.cubicBezier(g, 291, 420, 288, 422, 294, 433, 298, 428);
        Tools.cubicBezier(g, 291, 420, 298, 416, 301, 423, 298, 428);
        Tools.cubicBezier(g, 304, 412, 302, 415, 305, 417, 308, 416);
        Tools.cubicBezier(g, 304, 412, 306, 409, 310, 414, 308, 416);

        Tools.cubicBezier(g, 419, 414, 412, 422, 427, 429, 429, 422);
        Tools.cubicBezier(g, 419, 414, 425, 405, 432, 414, 429, 422);
        Tools.cubicBezier(g, 417, 393, 414, 396, 419, 397, 420, 396);
        Tools.cubicBezier(g, 417, 393, 420, 390, 422, 395, 420, 396);
        Tools.cubicBezier(g, 435, 410, 432, 413, 436, 415, 438, 414);
        Tools.cubicBezier(g, 435, 410, 437, 409, 441, 412, 438, 414);
        Tools.cubicBezier(g, 408, 432, 406, 435, 410, 437, 412, 435);
        Tools.cubicBezier(g, 408, 432, 411, 429, 415, 433, 412, 435);
        Tools.cubicBezier(g, 426, 440, 424, 442, 425, 445, 428, 442);
        Tools.cubicBezier(g, 426, 440, 427, 438, 431, 440, 428, 442);

        // shadow
        Color filledcolor = new Color(154, 105, 94);
        Tools.floodFill(g, buffer, 425, 275, filledcolor);
        Tools.floodFill(g, buffer, 303, 215, filledcolor);

        filledcolor = new Color(233, 146, 145);
        Tools.floodFill(g, buffer, 297, 222, filledcolor);

        filledcolor = new Color(76, 53, 47);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 78, 231, 77, 243, 80, 242, 92, 265);
        Tools.cubicBezier(g, 89, 253, 91, 237, 96, 248, 98, 251);
        Tools.cubicBezier(g, 98, 253, 103, 235, 108, 241, 112, 246);
        Tools.cubicBezier(g, 111, 245, 111, 237, 116, 230, 125, 233);
        Tools.cubicBezier(g, 125, 233, 112, 225, 123, 220, 137, 210);
        Tools.floodFill(g, buffer, 114, 231, filledcolor);

        Tools.cubicBezier(g, 149, 319, 186, 329, 186, 332, 202, 347);
        Tools.cubicBezier(g, 199, 342, 201, 328, 209, 330, 221, 335);
        Tools.floodFill(g, buffer, 200, 330, filledcolor);

        Tools.cubicBezier(g, 207, 318, 245, 344, 263, 349, 301, 337);
        Tools.floodFill(g, buffer, 250, 343, filledcolor);
        Tools.cubicBezier(g, 261, 351, 275, 351, 280, 350, 290, 352);
        Tools.floodFill(g, buffer, 279, 350, filledcolor);
        Tools.cubicBezier(g, 289, 350, 293, 343, 308, 336, 313, 335);
        Tools.floodFill(g, buffer, 307, 335, filledcolor);
        Tools.floodFill(g, buffer, 294, 343, filledcolor);
        Tools.floodFill(g, buffer, 301, 338, filledcolor);
        Tools.cubicBezier(g, 313, 334, 317, 326, 339, 314, 347, 319);
        Tools.cubicBezier(g, 377, 322, 366, 322, 357, 316, 347, 319);
        Tools.floodFill(g, buffer, 350, 317, filledcolor);
        Tools.cubicBezier(g, 359, 317, 394, 328, 407, 307, 411, 296);
        Tools.floodFill(g, buffer, 400, 317, filledcolor);

        Tools.cubicBezier(g, 271, 230, 276, 243, 292, 256, 299, 258);
        Tools.cubicBezier(g, 257, 260, 271, 251, 280, 254, 299, 258);
        Tools.cubicBezier(g, 246, 257, 249, 255, 252, 253, 252, 250);
        Tools.cubicBezier(g, 238, 269, 241, 268, 253, 257, 250, 256);
        Tools.floodFill(g, buffer, 270, 240, filledcolor);
        Tools.cubicBezier(g, 354, 233, 341, 241, 350, 252, 350, 252);
        Tools.floodFill(g, buffer, 344, 240, filledcolor);

        Tools.cubicBezier(g, 412, 335, 414, 328, 414, 324, 420, 322);
        Tools.floodFill(g, buffer, 416, 320, filledcolor);
        Tools.cubicBezier(g, 462, 288, 464, 282, 469, 273, 475, 272);
        Tools.cubicBezier(g, 459, 203, 458, 211, 463, 217, 469, 222);
        Tools.floodFill(g, buffer, 463, 227, filledcolor);

        Tools.cubicBezier(g, 194, 357, 202, 368, 210, 376, 234, 377);
        Tools.cubicBezier(g, 228, 340, 229, 353, 244, 368, 252, 369);
        Tools.cubicBezier(g, 253, 370, 251, 372, 250, 384, 261, 389);
        Tools.floodFill(g, buffer, 214, 371, filledcolor);
        Tools.floodFill(g, buffer, 231, 345, filledcolor);
        Tools.floodFill(g, buffer, 254, 373, filledcolor);

        Tools.cubicBezier(g, 355, 372, 359, 368, 360, 374, 360, 376);
        Tools.floodFill(g, buffer, 357, 373, filledcolor);
        Tools.cubicBezier(g, 335, 418, 340, 428, 342, 473, 341, 441);
        Tools.cubicBezier(g, 376, 411, 374, 420, 373, 427, 377, 428);
        Tools.floodFill(g, buffer, 343, 437, filledcolor);
        Tools.floodFill(g, buffer, 374, 428, filledcolor);

        Tools.cubicBezier(g, 390, 426, 392, 427, 400, 421, 402, 411);
        Tools.floodFill(g, buffer, 398, 423, filledcolor);

        // lighter?
        filledcolor = new Color(182, 144, 136);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 168, 247, 114, 252, 200, 293, 209, 278);
        Tools.cubicBezier(g, 168, 247, 194, 244, 217, 262, 209, 278);
        Tools.floodFill(g, buffer, 177, 260, filledcolor);
        Tools.cubicBezier(g, 313, 291, 301, 273, 315, 268, 330, 284);
        Tools.cubicBezier(g, 313, 291, 337, 325, 341, 296, 330, 284);
        Tools.floodFill(g, buffer, 323, 293, filledcolor);

        Tools.cubicBezier(g, 335, 328, 333, 319, 341, 314, 343, 326);
        Tools.cubicBezier(g, 335, 328, 337, 338, 343, 333, 343, 326);
        Tools.floodFill(g, buffer, 338, 326, filledcolor);
        Tools.cubicBezier(g, 339, 353, 337, 342, 345, 344, 348, 354);
        Tools.cubicBezier(g, 339, 353, 340, 363, 350, 365, 348, 354);
        Tools.floodFill(g, buffer, 345, 354, filledcolor);
        Tools.cubicBezier(g, 343, 385, 341, 372, 353, 373, 352, 385);
        Tools.cubicBezier(g, 343, 385, 344, 398, 352, 396, 352, 385);
        Tools.floodFill(g, buffer, 347, 383, filledcolor);

        Tools.cubicBezier(g, 368, 332, 366, 320, 375, 327, 376, 334);
        Tools.cubicBezier(g, 368, 332, 369, 341, 377, 340, 376, 334);
        Tools.floodFill(g, buffer, 373, 332, filledcolor);
        Tools.cubicBezier(g, 373, 356, 372, 349, 378, 346, 381, 356);
        Tools.cubicBezier(g, 373, 356, 374, 362, 383, 367, 381, 356);
        Tools.floodFill(g, buffer, 376, 357, filledcolor);
        Tools.cubicBezier(g, 374, 383, 376, 367, 384, 377, 385, 386);
        Tools.cubicBezier(g, 374, 383, 373, 397, 385, 396, 385, 386);
        Tools.floodFill(g, buffer, 380, 383, filledcolor);

        Tools.cubicBezier(g, 389, 300, 372, 273, 395, 273, 403, 295);
        Tools.cubicBezier(g, 389, 300, 394, 308, 410, 313, 403, 295);
        Tools.floodFill(g, buffer, 394, 295, filledcolor);
        Tools.cubicBezier(g, 438, 254, 395, 232, 405, 278, 439, 284);
        Tools.cubicBezier(g, 438, 254, 469, 270, 470, 290, 439, 284);
        Tools.floodFill(g, buffer, 446, 270, filledcolor);

        // nose
        filledcolor = new Color(171, 98, 95);
        g.setColor(filledcolor);
        Tools.cubicBezier(g, 292, 225, 299, 225, 304, 225, 307, 218);
        Tools.floodFill(g, buffer, 303, 225, filledcolor);
        // eye
        filledcolor = new Color(0, 0, 1);
        Tools.floodFill(g, buffer, 289, 214, filledcolor);
        Tools.floodFill(g, buffer, 300, 211, filledcolor);

        filledcolor = new Color(189, 189, 189);
        g.setColor(filledcolor);
        Tools.setStroke(2);
        Tools.cubicBezier(g, 234, 454, 269, 521, 414, 476, 423, 450);
        Tools.floodFill(g, buffer, 356, 453, filledcolor);

        Tools.floodFill(g, buffer, 246, 438, filledcolor);
        Tools.floodFill(g, buffer, 261, 431, filledcolor);
        Tools.floodFill(g, buffer, 266, 443, filledcolor);
        Tools.floodFill(g, buffer, 296, 423, filledcolor);
        Tools.floodFill(g, buffer, 306, 414, filledcolor);

        Tools.floodFill(g, buffer, 410, 434, filledcolor);
        Tools.floodFill(g, buffer, 425, 419, filledcolor);
        Tools.floodFill(g, buffer, 427, 441, filledcolor);
        Tools.floodFill(g, buffer, 419, 394, filledcolor);
        Tools.floodFill(g, buffer, 436, 412, filledcolor);

        filledcolor = new Color(161, 160, 160);
        g.setColor(filledcolor);
        Tools.setStroke(1);
        Tools.cubicBezier(g, 259, 447, 273, 452, 267, 466, 266, 460);
        Tools.cubicBezier(g, 274, 448, 274, 448, 266, 472, 266, 460);
        Tools.floodFill(g, buffer, 271, 450, filledcolor);
        Tools.floodFill(g, buffer, 265, 449, filledcolor);

        Tools.cubicBezier(g, 302, 459, 307, 458, 310, 455, 318, 454);
        Tools.floodFill(g, buffer, 307, 455, filledcolor);
        Tools.cubicBezier(g, 372, 431, 370, 440, 370, 459, 370, 459);
        Tools.floodFill(g, buffer, 369, 437, filledcolor);
        Tools.cubicBezier(g, 397, 432, 401, 443, 399, 446, 397, 452);
        Tools.floodFill(g, buffer, 397, 443, filledcolor);

        return buffer;
    }
}
