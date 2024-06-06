import os
import shutil

def replace_png_images(root_folder, replacement_image_path):
    for dirpath, _, filenames in os.walk(root_folder):
        for filename in filenames:
            if filename.endswith('.png'):
                file_path = os.path.join(dirpath, filename)
                shutil.copy(replacement_image_path, file_path)
                print(f"Replaced: {file_path}")

# 设置要遍历的文件夹和替换图片的路径
root_folder = r'D:\code\Android\MusicPlayer\app\src\main\res'  # 替换为你的文件夹路径
replacement_image_path = r'D:\音乐.png'  # 替换为你的替换图片路径

# 调用函数替换图片
replace_png_images(root_folder, replacement_image_path)