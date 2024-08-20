def cat_dog(str):
  cat_count = 0
  dog_count = cat_count

  for i in range(len(str)-2):
      if str[i:i+3] == "cat":
          cat_count += 1
      if str[i:i+3] == "dog":
          dog_count += 1

  return cat_count == dog_count
