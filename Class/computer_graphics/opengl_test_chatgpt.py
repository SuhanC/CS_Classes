from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

# Set up window dimensions
width = 800
height = 600

# Set up animation variables
x_position = 0
y_position = 0
x_direction = 1
y_direction = 1

def draw():
    global x_position, y_position, x_direction, y_direction

    # Clear the screen
    glClear(GL_COLOR_BUFFER_BIT)

    # Set the color for the square
    glColor3f(1.0, 0.0, 0.0)

    # Draw a square
    glBegin(GL_QUADS)
    glVertex2f(x_position, y_position)
    glVertex2f(x_position + 50, y_position)
    glVertex2f(x_position + 50, y_position + 50)
    glVertex2f(x_position, y_position + 50)
    glEnd()

    # Update the position of the square
    x_position += x_direction
    y_position += y_direction

    # Reverse direction if square hits the edges of the window
    if x_position > width - 50 or x_position < 0:
        x_direction *= -1
    if y_position > height - 50 or y_position < 0:
        y_direction *= -1

    # Swap the buffers
    glutSwapBuffers()

def update(value):
    glutPostRedisplay()
    glutTimerFunc(30, update, 0)

def main():
    global width, height

    # Initialize the window
    glutInit()
    glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB)
    glutInitWindowSize(width, height)
    glutCreateWindow(b"PyOpenGL Animation")

    # Set the background color
    glClearColor(0.0, 0.0, 0.0, 0.0)

    # Set the projection matrix
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0, width, 0, height, -1, 1)

    # Set the modelview matrix
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()

    # Set up the update function
    glutTimerFunc(30, update, 0)

    # Set up the display function
    glutDisplayFunc(draw)

    # Start the main loop
    glutMainLoop()

if __name__ == "__main__":
    main()
