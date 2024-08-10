package mit3206.assignment.graphview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class GraphView extends View {
    private Paint paint;
    private Paint textPaint;

    public GraphView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);

        textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw axes
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(3);
        canvas.drawLine(100, 400, 500, 400, paint); // X-axis
        canvas.drawLine(100, 50, 100, 400, paint); // Y-axis

        // Draw numbers on X-axis
        canvas.drawText("0", 90, 420, textPaint);
        canvas.drawText("1", 190, 420, textPaint);
        canvas.drawText("2", 290, 420, textPaint);
        canvas.drawText("3", 390, 420, textPaint);
        canvas.drawText("4", 490, 420, textPaint);

        // Draw numbers on Y-axis
        canvas.drawText("0", 70, 405, textPaint);
        canvas.drawText("2", 70, 365, textPaint);
        canvas.drawText("4", 70, 305, textPaint);
        canvas.drawText("6", 70, 205, textPaint);
        canvas.drawText("8", 70, 105, textPaint);

        // Draw the graph (Red line)
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        canvas.drawLine(100, 230, 300, 230, paint);
        canvas.drawLine(300, 230, 400, 405, paint);
        canvas.drawLine(400, 405, 450, 305, paint);
    }
}
